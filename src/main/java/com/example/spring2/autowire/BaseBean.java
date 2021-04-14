package com.example.spring2.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseBean<T>{

    @Auto
    private T t;

    public T getT() {
        return t;
    }


}
