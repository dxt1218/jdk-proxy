package com.example.spring2.bean;

import org.springframework.context.annotation.Bean;

public class BeanConfig {



    @Bean("user1")
    public User user(){
        return new User();
    }

    @Bean("user2")
    public User user1(){
        return new User();
    }
}
