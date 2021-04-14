package com.example.spring2.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 模拟Spring-aop形式的动态代理实现
 */
public class AopInvocationHandler implements InvocationHandler {

    private Object target;

    public AopInvocationHandler(Object object) {
        this.target = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("aop-before method");//@before  前置增强 方法

        Object invoke = method.invoke(target, args);//目标对象自身方法逻辑

        System.out.println("aop-after method");//@after 后置增强  方法
        return invoke;
    }
}
