package ssmdemo.entity;

/**
 * @author Enhao Sun
 * @version 2019-04-15.
 */
public class User {
    private String userName;
    private String password;
    private String email;


    @Override
    public String toString() {
        return "User [userName=" + userName + ", password=" + password + ", email=" + email +"]";
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
