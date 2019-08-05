package com.shopplus.service;


import com.shopplus.pojo.LoginResult;
import com.shopplus.pojo.User;

public interface UserService {
    int login(User user);
    LoginResult isLogin(User user);

    boolean validateUserName(String userName);

    int insertUser(User user);
}
