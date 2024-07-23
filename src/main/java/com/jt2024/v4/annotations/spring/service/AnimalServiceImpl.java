package com.jt2024.v4.annotations.spring.service;

import com.jt2024.v4.annotations.spring.model.Animal;
import com.jt2024.v4.annotations.spring.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("animalService")
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
