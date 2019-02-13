package com.a.dao;
import com.a.domain.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import  com.a.domain.T;
@Repository
public class UserMybatisTemplateDao {
    private SqlSessionTemplate sessionTemplate;

    @Autowired
    public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
        this.sessionTemplate = sessionTemplate;
    }
//    public boolean addUser
    public User getUser(String name,String pass){
        UserDao userDao = sessionTemplate.getMapper(UserDao.class);
        return  userDao.getUser(name,pass);
    }
}
