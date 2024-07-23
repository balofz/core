package com.jt2024.lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifecycleBean {

    @PostConstruct
    public void init() {
        System.out.println("ExampleBean is going through init.");
    }

    public void doSomething() {
        System.out.println("In ExampleBean, doing something.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("ExampleBean will be destroyed now.");
    }
}
