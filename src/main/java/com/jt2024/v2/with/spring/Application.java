package com.jt2024.v2.with.spring;

import com.jt2024.v2.with.spring.service.AnimalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalService service = context.getBean("animalService", AnimalService.class);
        System.out.println(service.findAll().get(0).getName());
    }
}
