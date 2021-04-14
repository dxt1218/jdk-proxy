package com.example.spring2.imp;

import com.example.spring2.ex.QueryMapper;

public class Test {
    public static void main(String[] args) {
        //正常的创建调用查询方法
        BaseMapper queryMapper = new SelectMapper();
        queryMapper.select();
        System.out.println("=====================");
        //代理的形式调用方法
        BaseMapper proxyMapper = new ProxyMapper(queryMapper);
        proxyMapper.select();
        System.out.println("=====================");
        //先执行  代理->新增统计方法->查询
        BaseMapper proxy = new ProxyMapper(new CountMapper(new SelectMapper()));
        proxy.select();
    }
}
