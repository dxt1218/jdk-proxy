package com.example.spring2.imp;

/**
 * 搜索方法
 */
public class SelectMapper implements BaseMapper {


    @Override
    public void select() {
        System.out.println("select * from xxx");
    }
}
