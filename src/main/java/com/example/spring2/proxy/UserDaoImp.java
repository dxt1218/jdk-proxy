package com.example.spring2.proxy;

public class UserDaoImp implements UserDao {
    @Override
    public String select() {
        System.out.println("实现类方法");
        return "实现imp";
    }
}
