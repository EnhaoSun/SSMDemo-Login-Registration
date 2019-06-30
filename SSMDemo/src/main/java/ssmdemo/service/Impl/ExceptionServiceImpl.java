package ssmdemo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssmdemo.config.UserException;
import ssmdemo.entity.User;
import ssmdemo.mapper.UserMapper;
import ssmdemo.service.ExceptionService;

/**
 * @author Enhao Sun
 * @version 2019-04-17.
 */

@Service
public class ExceptionServiceImpl implements ExceptionService {

    private final UserMapper userMapper;

    @Autowired
    public ExceptionServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void loginException(User user, User db_user) throws UserException {
        if(db_user == null){
            throw new UserException("User not exists");
        }
        if(!user.getPassword().equals(db_user.getPassword())){
            throw new UserException("Wrong password");
        }
    }

    @Override
    public void addUserException1(User user) throws UserException {
        if (user.getUserName() == null || user.getUserName().trim().isEmpty()){
            throw new UserException("Username cannot be empty");
        }else if (user.getUserName().length() < 5 || user.getUserName().length() > 15){
            throw new UserException("Username length must between 5 to 15");
        }

        if (user.getPassword() == null || user.getPassword().trim().isEmpty()){
            throw new UserException("Password cannot be empty");
        }else if (user.getPassword().length() < 5 || user.getPassword().length() > 15){
            throw new UserException("Password length must between 5 to 15");
        }

        if (user.getEmail() == null || user.getEmail().trim().isEmpty()){
            throw new UserException("email cannot be empty");
        }
    }

    @Override
    public void addUserException2(User user) throws UserException {
        if (userMapper.findUserByName(user.getUserName()) != null){
            throw new UserException("Username already exists");
        } else if (userMapper.findUserByEmail(user.getEmail()) != null){
            throw new UserException("Email already exists");
        }
    }
}
