package com.tyfann.config;

import com.tyfann.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tyfann
 * @date 2021/3/25 4:54 下午
 */

@Configuration
public class TyfannConfig {

    @Bean
    public User user(){
        return new User();
    }
}
