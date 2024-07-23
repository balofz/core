package com.jt2024.v2.with.spring.service;

import com.jt2024.v2.with.spring.model.Animal;
import com.jt2024.v2.with.spring.repository.AnimalRepository;
import com.jt2024.v2.with.spring.repository.HibernateAnimalRepositoryImpl;

import java.util.List;

public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepository animalRepository;

    public AnimalServiceImpl(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }
    @Override
    public List<Animal> findAll() {
        return animalRepository.findAll();
    }
}
