package com.jt2024.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public LifecycleBean lifecycleBean() {
        return new LifecycleBean();
    }

}
