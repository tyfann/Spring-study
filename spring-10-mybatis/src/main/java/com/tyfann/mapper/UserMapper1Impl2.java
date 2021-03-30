package com.tyfann.mapper;

import com.tyfann.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author tyfann
 * @date 2021/3/30 10:33 上午
 */
public class UserMapper1Impl2 extends SqlSessionDaoSupport implements UserMapper1 {
    @Override
    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapper1.class).selectUser();
    }
}
