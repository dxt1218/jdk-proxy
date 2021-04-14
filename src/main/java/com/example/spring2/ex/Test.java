package com.example.spring2.ex;

public class Test {
    public static void main(String[] args) {
        //正常的创建调用查询方法
        BaseMapper queryMapper = new QueryMapper();
        queryMapper.select();
        System.out.println("=====================");
        //代理的形式调用方法
        BaseMapper proxyMapper = new ProxyMapper();
        proxyMapper.select();
    }
}
