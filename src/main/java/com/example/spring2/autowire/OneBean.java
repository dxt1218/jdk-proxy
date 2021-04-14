package com.example.spring2.autowire;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Qurlifier
public class OneBean extends BaseBean<Base> {

    private Optional<BaseBean> oneName;

    private ObjectFactory<BaseBean> oneName2;

    public void talk() {
        System.out.println(getT());
    }


}
