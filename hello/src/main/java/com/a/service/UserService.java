package com.a.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.a.dao.UserDao;
import com.a.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class UserService {
    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User hasMatch(String name, String pass) {
        User user = userDao.login(name, pass);
        return user;
    }
//    public User findUserByNameAndPass(String name,String tel){return  userDao.login()}

    public User findUserByNameAndTel(String name, String tel) {
        return userDao.getUser(name, tel);
    }

    @Transactional
    public void updateUser(User user, String updateName, String value) {
        //更新用户等路信息
        User newUser = new User();
        newUser.setName(user.getName());
        newUser.setPassword(user.getPassword());
        newUser.setTel(user.getTel());
        newUser.setAddress(user.getAddress());
        newUser.setCreateTime(user.getCreateTime());
        newUser.setEditTime(LocalDateTime.now());
        switch (updateName) {
            case "name":
                newUser.setName(value);
                break;
            case "password":
                newUser.setName(value);
                break;
            case "tel":
                newUser.setTel(value);
                break;
            case "address":
                newUser.setAddress(value);
                break;
        }

        userDao.updateUser(newUser, user);
    }

    @Transactional
    public void deleteUser(String name, String tel) {
        userDao.delete(name, tel);
    }
//
//    @Transactional
//    public void updatePass(String name, String tel, String security_code) {
//
//    }

}