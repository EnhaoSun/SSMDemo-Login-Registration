package ssmdemo.service;

import ssmdemo.config.UserException;
import ssmdemo.entity.User;

/**
 * @author Enhao Sun
 * @version 2019-04-15.
 */
public interface UserService {

    /**
     *
     * @param user
     * @return
     */
    void login(User user) throws UserException;


    /**
     *
     * @param user
     */
    void addUser(User user) throws UserException;
}
