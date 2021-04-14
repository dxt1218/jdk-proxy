package com.example.spring2.bean;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class User implements InitializingBean {


    public User() {
        System.out.println("实例化");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

            System.out.println("初始化");

    }

    private  String name;

    private String age;

    @Autowired
    @Lazy
    private Mama mama;

    private DuanPostProcessor p;

    public void talk(){
        System.out.println(mama);
        System.out.println(p);
    }

    @Autowired
    private void xxx(Mama m,DuanPostProcessor p ){
        this.mama = m;
        this.p = p;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Mama getMama() {
        return mama;
    }

    public void setMama(Mama mama) {
        System.out.println("set方法调用");
        this.mama = mama;
    }


    public static void main(String[] args) {
        Talk sunBean = new SunBean();
        Talk superBean = new SuperBean();
        sunBean.talk();
        superBean.talk();
    }

}
