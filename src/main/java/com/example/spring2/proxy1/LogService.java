package com.example.spring2.proxy1;

public class LogService  implements  Service{
    @Override
    public void talk() {
        System.out.println("log");
    }
}
