package com.example.spring2.proxy1;

public class ProxyMain {

    public static void main(String[] args) {
        Service tagetService =  new LogService();

        Service proxyService =  new PowerService(tagetService);

        Service proxy = new TxService(new PowerService(new LogService()));
        proxy.talk();
        //proxyService.talk();
    }
}
