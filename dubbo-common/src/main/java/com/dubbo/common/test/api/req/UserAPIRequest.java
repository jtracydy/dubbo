package com.dubbo.common.test.api.req;


import java.io.Serializable;

/**
 * 用户请求登录
 */


public class UserAPIRequest implements Serializable{

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
