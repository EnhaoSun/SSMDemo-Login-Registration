package ssmdemo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssmdemo.config.UserException;
import ssmdemo.mapper.UserMapper;
import ssmdemo.entity.User;
import ssmdemo.service.ExceptionService;
import ssmdemo.service.UserService;
import ssmdemo.util.MD5Util;

/**
 * @author Enhao Sun
 * @version 2019-04-15.
 */
@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    private final ExceptionService exceptionService;

    @Autowired
    public UserServiceImpl(UserMapper userMapper, ExceptionService exceptionService) {
        this.userMapper = userMapper;
        this.exceptionService = exceptionService;
    }

    @Override
    public void login(User user) throws UserException{
        User db_user = userMapper.findUserByName(user.getUserName());
        exceptionService.loginException(user, db_user);
    }

    @Override
    public void addUser(User user) throws UserException {
        //先判断用户的输入是否有错
        exceptionService.addUserException1(user);
        //再判断用户的信息是否已被注册
        try {
            String MD5pwd = MD5Util.MD5Encode(user.getPassword(), "UTF-8");
            user.setPassword(MD5pwd);
        }catch (Exception e){
            user.setPassword("");
        }
        exceptionService.addUserException2(user);
        userMapper.addUser(user);
    }
}
