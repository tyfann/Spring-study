package com.tyfann.service;

import com.tyfann.dao.UserDao;
import com.tyfann.dao.UserDaoImpl;

/**
 * @author tyfann
 * @date 2021/3/24 5:44 下午
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
