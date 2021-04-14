package com.example.spring2.proxy;

public class AopProxyMain {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        UserDao userDao = (UserDao) AopProxyFactory.getMapper(new UserDaoImp());
        userDao.select();
   /*     Class<?> proxyClass = Proxy.getProxyClass(TestProxyMain.class.getClassLoader(), UserDao.class);
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(userDao);
        System.out.println(invocationHandler);*/
    }
}
