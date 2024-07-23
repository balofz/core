package com.jt2024.v3.scope.spring;

import com.jt2024.v3.scope.spring.repository.AnimalRepository;
import com.jt2024.v3.scope.spring.repository.HibernateAnimalRepositoryImpl;
import com.jt2024.v3.scope.spring.service.AnimalService;
import com.jt2024.v3.scope.spring.service.AnimalServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "animalService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public AnimalService getAnimalService() {
        return new AnimalServiceImpl(getAnimalRepository());
    }


    @Bean(name = "animalRepository")
    public AnimalRepository getAnimalRepository() {
        return new HibernateAnimalRepositoryImpl();
    }
}
