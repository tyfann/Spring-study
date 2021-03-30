package com.tyfann.mapper;

import com.tyfann.pojo.User;

import java.util.List;

/**
 * @author tyfann
 * @date 2021/3/30 9:25 上午
 */
public interface UserMapper {
    public List<User> selectUser();

    public int addUser(User user);

    public int deleteUser(int id);
}
