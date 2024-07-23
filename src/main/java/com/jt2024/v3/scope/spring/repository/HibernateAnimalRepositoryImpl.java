package com.jt2024.v3.scope.spring.repository;

import com.jt2024.v3.scope.spring.model.Animal;

import java.util.Collections;
import java.util.List;

public class HibernateAnimalRepositoryImpl implements AnimalRepository {
    @Override
    public List<Animal> findAll() {
        final Animal animal = new Animal("Bobby", "Dog");
        return Collections.singletonList(animal);
    }
}
