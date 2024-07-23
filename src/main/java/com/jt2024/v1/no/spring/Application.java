package com.jt2024.v1.no.spring;

import com.jt2024.v1.no.spring.service.AnimalService;
import com.jt2024.v1.no.spring.service.AnimalServiceImpl;

public class Application {

    public static void main(String[] args) {
        AnimalService speakerService = new AnimalServiceImpl();
        System.out.println(speakerService.findAll().get(0).getName());
    }
}
