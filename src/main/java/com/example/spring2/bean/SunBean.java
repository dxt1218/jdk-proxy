package com.example.spring2.bean;

public class SunBean extends SuperBean{

    private String sunName;


    private String sunAge;

    public void suntalk(){
        talk();
    }


    public void talk(){
        System.out.println("子类的重写方法talk");
    }


}
