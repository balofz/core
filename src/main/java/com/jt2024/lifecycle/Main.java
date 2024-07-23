package com.jt2024.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        LifecycleBean exampleBean = context.getBean(LifecycleBean.class);
        exampleBean.doSomething();
        context.close();
    }

}
