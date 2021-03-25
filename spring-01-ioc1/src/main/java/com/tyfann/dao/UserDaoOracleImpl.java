package com.tyfann.dao;

/**
 * @author tyfann
 * @date 2021/3/24 5:44 下午
 */
public class UserDaoOracleImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("调用oracle的user类方法!");
    }
}
