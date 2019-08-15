package com.shopplus.mapper;


import com.shopplus.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {



    int login(User user);
    int isLogin(User user);

    int selectUserName(String userName);

    int insertUser(User user);

    User findUser(User user);

    void updateUserById(User user);
}
