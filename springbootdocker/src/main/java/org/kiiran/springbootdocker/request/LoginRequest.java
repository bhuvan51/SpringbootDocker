package org.kiiran.springbootdocker.request;

public class LoginRequest {

    private  int login_id;

    public int getLogin_ID() {
        return login_id;
    }

    public void setLogin_ID(int login_id) {
        this.login_id = login_id;
    }

    private String userName;
    private String password;

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
}
