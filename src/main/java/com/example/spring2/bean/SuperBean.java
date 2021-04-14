package com.example.spring2.bean;

import lombok.Data;

@Data
public class SuperBean implements Talk{

    private String name;

    private String age;


    public void talk(){
        System.out.println("父级类方法talk");
    }
}
