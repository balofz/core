package com.jt2024.v3.scope.spring;

import com.jt2024.v3.scope.spring.service.AnimalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AnimalService service1 = context.getBean("animalService", AnimalService.class);
        System.out.println(service1);

        AnimalService service2 = context.getBean("animalService", AnimalService.class);
        System.out.println(service2);
    }
}
