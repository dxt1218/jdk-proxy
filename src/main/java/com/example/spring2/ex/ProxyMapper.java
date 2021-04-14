package com.example.spring2.ex;

public class ProxyMapper  extends  QueryMapper{

    @Override
    public void select() {
        System.out.println("代理方法");
        super.select();
    }
}
