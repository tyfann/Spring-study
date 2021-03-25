package com.tyfann.dao;

/**
 * @author tyfann
 * @date 2021/3/24 5:44 下午
 */
public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("调用mysql的user类方法!");
    }
}
