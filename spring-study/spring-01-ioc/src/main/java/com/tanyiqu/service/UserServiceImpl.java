package com.tanyiqu.service;

import com.tanyiqu.dao.UserDao;
import com.tanyiqu.dao.UserDaoImpl;
import com.tanyiqu.dao.UserDaoImplMySQL;
import com.tanyiqu.dao.UserDaoImplOracle;

public class UserServiceImpl implements UserService {


    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
