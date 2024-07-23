package com.jt2024.v3.scope.spring.service;

import com.jt2024.v3.scope.spring.model.Animal;
import com.jt2024.v3.scope.spring.repository.AnimalRepository;

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
