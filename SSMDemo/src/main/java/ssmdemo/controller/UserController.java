package ssmdemo.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ssmdemo.config.UserException;
import ssmdemo.entity.User;
import ssmdemo.service.ExceptionService;
import ssmdemo.service.UserService;
import ssmdemo.util.MD5Util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Enhao Sun
 * @version 2019-04-14.
 */
@Controller
@RequestMapping(value = {"/", "home"})
public class UserController {

    private final UserService userService;
    private final ExceptionService exceptionService;

    @Autowired
    public UserController(UserService userService, ExceptionService exceptionService) {
        this.userService = userService;
        this.exceptionService = exceptionService;
    }

    @RequestMapping(value = "/registerForm")
    public ModelAndView registerForm(){
        return new ModelAndView("register");
    }

    @RequestMapping(value = "/loginPage")
    public ModelAndView loginPage(){
        return new ModelAndView("login");
    }


    @RequestMapping(value = "/register")
    public ModelAndView addUser(User user, HttpServletRequest request){
        ModelAndView modelAndView;
        modelAndView = new ModelAndView("addUserSuccessful");
        //if no exception, then return addUserSuccessful page
        try{
            userService.addUser(user);
        }catch (UserException e){
            modelAndView = new ModelAndView("register");
            modelAndView.addObject("message", e.getMessage());
        }
        return modelAndView;
    }


    @RequestMapping(value = "/checkLogin", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView checkLogin(User user, HttpServletRequest request){

        ModelAndView modelAndView;
        modelAndView = new ModelAndView("home");
        try {
            String MD5pwd = MD5Util.MD5Encode(user.getPassword(), "UTF-8");
            user.setPassword(MD5pwd);
        }catch (Exception e){
            user.setPassword("");
        }

        try {
            userService.login(user);
        } catch (UserException e){
            modelAndView = new ModelAndView("login");
            modelAndView.addObject("message", e.getMessage());
        }
        return modelAndView;
    }

    @RequestMapping
    public String handelRequest(Model model){
        model.addAttribute("msg", "Welcome to SSMDemo");
        return "home";
    }


}
