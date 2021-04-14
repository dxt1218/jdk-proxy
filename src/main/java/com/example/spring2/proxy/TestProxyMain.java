package com.example.spring2.proxy;

import com.example.spring2.bean.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestProxyMain {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
       // System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        UserDao userDao = (UserDao) MapperFactory.getMapper(UserDao.class);
        userDao.select();
   /*     Class<?> proxyClass = Proxy.getProxyClass(TestProxyMain.class.getClassLoader(), UserDao.class);
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(userDao);
        System.out.println(invocationHandler);*/
    }
}
