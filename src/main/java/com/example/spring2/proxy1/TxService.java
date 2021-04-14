package com.example.spring2.proxy1;

public class TxService implements Service {

    private Service tagert;

    public TxService(Service tagert) {
        this.tagert = tagert;
    }

    @Override
    public void talk() {
        System.out.println("tx");
        tagert.talk();
    }


}
