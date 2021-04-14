package com.example.spring2.proxy1;

public class PowerService implements Service {

    private Service tagert;

    public PowerService(Service tagert) {
        this.tagert = tagert;
    }

    @Override
    public void talk() {
        System.out.println("power");
        tagert.talk();
    }


}
