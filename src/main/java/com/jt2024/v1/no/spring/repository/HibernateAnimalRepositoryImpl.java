package com.jt2024.v1.no.spring.repository;

import com.jt2024.v1.no.spring.model.Animal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class HibernateAnimalRepositoryImpl implements AnimalRepository{
    @Override
    public List<Animal> findAll() {
        final Animal animal = new Animal("Bobby", "Dog");
        return Collections.singletonList(animal);
    }
}
