package com.jt2024.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Value("${custom.greeting:Hello}")
    private String greeting;

    public void greet() {
        System.out.println(greeting);
    }
}
