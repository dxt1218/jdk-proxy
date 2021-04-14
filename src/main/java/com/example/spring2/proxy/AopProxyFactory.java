package com.example.spring2.proxy;

import java.lang.reflect.Proxy;


public class AopProxyFactory {
    public static Object getMapper(Object target) {
        //interfaces  为目标对象实现的多个接口
        Class[] classes = target.getClass().getInterfaces();//获取对象所有的接口class集合
        //获取接口集的代理对象
        Object o = Proxy.newProxyInstance(AopProxyFactory.class.getClassLoader(),//类加载器
                classes,//接口集
                new AopInvocationHandler(target));//目标对象传入  指定的调用处理程序
        return o;
    }
}