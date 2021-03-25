package com.tyfann.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author tyfann
 * @date 2021/3/25 4:36 下午
 */
@Component
public class User {
    @Value("tyfann")
    public String name;
}
