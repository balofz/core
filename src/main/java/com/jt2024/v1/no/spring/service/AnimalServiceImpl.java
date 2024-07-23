package com.jt2024.v1.no.spring.service;

import com.jt2024.v1.no.spring.model.Animal;
import com.jt2024.v1.no.spring.repository.AnimalRepository;
import com.jt2024.v1.no.spring.repository.HibernateAnimalRepositoryImpl;

import java.util.List;

public class AnimalServiceImpl implements AnimalService{

    private final AnimalRepository animalRepository = new HibernateAnimalRepositoryImpl();

    @Override
    public List<Animal> findAll() {
        return animalRepository.findAll();
    }
}
