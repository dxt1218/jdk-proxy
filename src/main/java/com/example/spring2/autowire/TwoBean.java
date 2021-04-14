package com.example.spring2.autowire;
import org.springframework.stereotype.Component;

@Component
public class TwoBean extends BaseBean<Base2>{

    private String twoName;

    public void talk() {
        System.out.println(getT());
    }
}
