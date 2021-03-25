package com.tyfann.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author tyfann
 * @date 2021/3/25 4:53 下午
 */

@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("tyfann")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
