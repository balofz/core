package com.jt2024.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class HeavyResourceService {

    public HeavyResourceService() {
        // Simulate a long initialization
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("HeavyResourceService initialized");
    }

    public String getResource() {
        return "Heavy resource";
    }
}
