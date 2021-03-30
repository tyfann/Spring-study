package com.tyfann.mapper;

import com.tyfann.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author tyfann
 * @date 2021/3/30 10:19 上午
 */
public class UserMapper1Impl implements UserMapper1 {
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);
        return mapper.selectUser();
    }
}
