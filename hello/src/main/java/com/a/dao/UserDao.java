package com.a.dao;

import com.a.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    //    登录
    User login(String name,String password);
    //    通过手机号 和 姓名 查找用户
    void updateUser(@Param("new")User New, @Param("old")User Old);
    //    更改信息
    User getUser(String name,String tel);
    void addUser(User user);
    void delete(String name,String tel);
}
