package ssmdemo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import ssmdemo.entity.User;

/**
 * @author Enhao Sun
 * @version 2019-04-15.
 */
@Repository
public interface UserMapper {


    @Insert("INSERT INTO ssm_user(user_name, password) " +
            "VALUES(#{userName}, #{password})")
    void addUser(User user);

    @Select("SELECT * FROM " +
            "ssm_user WHERE user_name=#{username} LIMIT 1")
    User findUserByName(String username);

    @Select("SELECT * FROM " +
            "ssm_user WHERE email=#{email} LIMIT 1")
    User findUserByEmail(String email);

}
