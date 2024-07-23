package com.jt2024.v5.autowired.spring;

import com.jt2024.v5.autowired.spring.service.AnimalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.jt2024.v5")
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        AnimalService service1 = context.getBean("animalService", AnimalService.class);
        System.out.println(service1.findAll().get(0).getName());
    }
}
