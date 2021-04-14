package com.example.spring2;

import com.example.spring2.autowire.OneBean;
import com.example.spring2.autowire.TwoBean;
import com.example.spring2.bean.Mama;
import com.example.spring2.bean.User;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.context.XmlServletWebServerApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;
import java.lang.annotation.Annotation;


@ComponentScan("com.example.spring2")
public class Spring2Application {

    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Spring2Application.class);
        OneBean oneBean = (OneBean) context.getBean("oneBean");
        oneBean.talk();
        TwoBean twoBean = (TwoBean) context.getBean("twoBean");
        twoBean.talk();
   /*     User user = (User) context.getBean("user");
        user.talk();
        System.out.println(user.getClass());
        System.out.println(new User().getClass());*/
       /* ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("BeanConfig.xml");
        User user = (User) context1.getBean("user");
        user.talk();
*/
        /**
         *
         * 实例化之前
         * 推断构造方法
         *
         * Bean的生命周期
         * 实例化
         * BeanDefinition的后置处理
         * 实例化后-后置处理器
         * 属性填充
         * 属性填充后
         * 执行Aware方法回调
         * 初始化前-后置处理器
         * 初始化
         * 初始化后-后置处理器
         * */
        System.out.println();
       // SpringApplication.run(Spring2Application.class, args);
    }

}
