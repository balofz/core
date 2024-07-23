package com.jt2024.v2.with.spring;

import com.jt2024.v2.with.spring.repository.AnimalRepository;
import com.jt2024.v2.with.spring.repository.HibernateAnimalRepositoryImpl;
import com.jt2024.v2.with.spring.service.AnimalService;
import com.jt2024.v2.with.spring.service.AnimalServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "animalService")
    public AnimalService getAnimalService() {
        return new AnimalServiceImpl(getAnimalRepository());
    }


    @Bean(name = "animalRepository")
    public AnimalRepository getAnimalRepository() {
        return new HibernateAnimalRepositoryImpl();
    }
}
