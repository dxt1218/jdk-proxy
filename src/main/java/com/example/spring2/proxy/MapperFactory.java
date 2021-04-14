package com.example.spring2.proxy;

import com.alibaba.fastjson.JSONArray;

import javax.naming.spi.ObjectFactory;
import java.lang.reflect.Proxy;


public class MapperFactory {
    public static Object getMapper(Class interfaces) {
        //interfaces  为目标对象实现的多个接口
        Class[] classes = {interfaces};
        //获取接口集的代理对象
        Object o = Proxy.newProxyInstance(MapperFactory.class.getClassLoader(),//类加载器
                classes,//接口集
                new MapperInvocationHandler());//指定的调用处理程序
        return o;
    }
}