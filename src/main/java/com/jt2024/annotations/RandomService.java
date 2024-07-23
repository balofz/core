package com.jt2024.annotations;

import org.springframework.stereotype.Service;

@Service
public class RandomService {

    @LogExecutionTime(clazz = "RandomService", method = "execute")
    public void execute() throws InterruptedException {
        System.out.println("Working hard...");
        Thread.sleep(2000);
    }
}
