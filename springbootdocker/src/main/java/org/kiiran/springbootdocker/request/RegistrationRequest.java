package org.kiiran.springbootdocker.request;

public class RegistrationRequest {

    private Integer registration_id;
    private String userName;
    private String password;
    private String Sex;
    private String type;
    private Integer age;

    public Integer getRegistration_id() {
        return registration_id;
    }

    public void setRegistration_id(Integer registration_id) {
        this.registration_id = registration_id;
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

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
