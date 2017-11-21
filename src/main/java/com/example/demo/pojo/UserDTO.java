package com.example.demo.pojo;

/**
 * Created by xf on 2017/10/26.
 */
public class UserDTO {

    private String  name;

    private String userUid;

    private String password;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }
}
