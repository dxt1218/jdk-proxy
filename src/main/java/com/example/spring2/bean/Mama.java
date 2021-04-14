package com.example.spring2.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Mama {

    @Autowired
    private List<User> users;


    private  String m_name;

    private String m_age;

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_age() {
        return m_age;
    }

    public void setM_age(String m_age) {
        this.m_age = m_age;
    }
}
