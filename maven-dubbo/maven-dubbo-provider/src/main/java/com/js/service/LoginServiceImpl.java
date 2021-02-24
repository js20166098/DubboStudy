package com.js.service;

import com.js.api.ILoginService;

public class LoginServiceImpl implements ILoginService {

    @Override
    public String login(String username, String password) {
        //写业务逻辑
        if(username.equals("admin")&&password.equals("admin")){
            return "SUCCESS";
        }
        return "FAILED";
    }
}
