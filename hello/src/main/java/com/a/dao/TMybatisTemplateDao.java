package com.a.dao;

import com.a.domain.T;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TMybatisTemplateDao {
    private SqlSessionTemplate sessionTemplate;
    @Autowired
    public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
        this.sessionTemplate = sessionTemplate;
    }
    public T selectT(String name)
    {
        return (T)sessionTemplate.selectOne("com.a.dao.TDao.getT");
    }
}




