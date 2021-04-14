package com.example.spring2.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * 模拟mybatis框架的mapper接口动态代理实现
 * */
public class MapperInvocationHandler implements InvocationHandler {


    public MapperInvocationHandler() {
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("链接数据库");
        Select annotation = method.getAnnotation(Select.class);
        System.out.println(annotation.value());
        System.out.println(method.getName());
        //return method.invoke(object,args);
        return method.getReturnType().newInstance();
    }
}
