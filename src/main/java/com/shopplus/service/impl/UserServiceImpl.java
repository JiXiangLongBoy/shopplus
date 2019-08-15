package com.shopplus.service.impl;


import com.shopplus.mapper.UserMapper;
import com.shopplus.pojo.LoginResult;
import com.shopplus.pojo.User;
import com.shopplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;




    @Override
    public LoginResult isLogin(User user) {
        System.out.println(user);
        int count = userMapper.login(user);
        System.out.println(count);
        if (count == 1) {
            int id = userMapper.isLogin(user);
            return new LoginResult(1,id,"用户名验证登录成功");
        } else {
            return new LoginResult(0,0,"用户名或密码错误，登陆失败");
        }
    }

    @Override
    public boolean validateUserName(String userName) {

        int count = userMapper.selectUserName(userName);
        return count > 0 ? true :false ;
    }

    @Override
    public int insertUser(User user) {

        return userMapper.insertUser(user);
    }

    @Override
    public User findUser(User user) {
        return userMapper.findUser(user);
    }

    @Override
    public void updateUserById(User user) {
        userMapper.updateUserById(user);
    }

}
