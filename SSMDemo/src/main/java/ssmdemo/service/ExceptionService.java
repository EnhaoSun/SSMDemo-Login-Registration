package ssmdemo.service;

import org.springframework.stereotype.Service;
import ssmdemo.config.UserException;
import ssmdemo.entity.User;

/**
 * @author Enhao Sun
 * @version 2019-04-17.
 */
public interface ExceptionService {

    void loginException(User user, User db_user) throws UserException;
    void addUserException1(User user) throws UserException;
    void addUserException2(User user) throws UserException;

}
