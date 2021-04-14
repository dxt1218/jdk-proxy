package com.example.spring2.autowire;

import org.springframework.stereotype.Component;

@Component
public class Base2 {

    private String baseName;

    private String baseAge;

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public String getBaseAge() {
        return baseAge;
    }

    public void setBaseAge(String baseAge) {
        this.baseAge = baseAge;
    }
}
