package com.jt2024.v5.autowired.spring.service;

import com.jt2024.v5.autowired.spring.model.Animal;
import com.jt2024.v5.autowired.spring.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("animalService")
public class AnimalServiceImpl implements AnimalService {


    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<Animal> findAll() {
        return animalRepository.findAll();
    }


    /*public void setAnimalRepository(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }*/

}
