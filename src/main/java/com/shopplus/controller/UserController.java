package com.shopplus.controller;


import com.shopplus.pojo.LoginResult;
import com.shopplus.pojo.User;
import com.shopplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user",method = {RequestMethod.GET,RequestMethod.POST})
public class UserController {


    @Autowired
    UserService userService;
    //登录页面
    @RequestMapping("/showLogin")
    public String showLogin() {
        return  "login";
    }
    //注册页面
    @RequestMapping("/showregister")
    public String showRegister(){
        return "register";
    }
    //找回密码
    @RequestMapping("/showfindpwd")
    public String showFindpwd(){
        return "find_pwd";
    }
    //登录
    @RequestMapping("/islogin")
    @ResponseBody
    public LoginResult testDemo(User user) {
        System.out.println(user.getUserName()+"!!"+user.getPassWord());
        LoginResult loginResult= userService.isLogin(user);
        return loginResult;
    }
    //验证用户名是否存在
    @RequestMapping("/validateUserName")
    @ResponseBody
    public String validateUserName(String userName){

        boolean isExist = userService.validateUserName(userName);
        //数据库操作
        return isExist?"fail":"success";
    }
    @RequestMapping("/insertUser")
    @ResponseBody
    public String insertUser(User user){
        System.out.println(user);
        int result = userService.insertUser(user);

        return result > 0 ? "success":"fail";
    }
    //查找用户信息（用户名和电话）
    @RequestMapping("/findUser")
    public User findUser(User user){
        return userService.findUser(user);
    }
    //修改用户（用户名，手机号，密码，地址）

    @RequestMapping("/updateUser")
    public String updateUser(User user){
        userService.updateUserById(user);
        return "user";
    }

}
