package com.a.service;

import com.a.dao.TDao;
import com.a.domain.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TService {
    private TDao tDao;
@Autowired
    public void settDao(TDao tDao) {
        this.tDao = tDao;
    }

    public int selectT(String name){
    return tDao.selectT(name);
    }
}
