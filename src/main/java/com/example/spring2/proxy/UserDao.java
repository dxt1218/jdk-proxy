package com.example.spring2.proxy;


public interface UserDao {

    @Select("select * from xxx")
    String select();

}
