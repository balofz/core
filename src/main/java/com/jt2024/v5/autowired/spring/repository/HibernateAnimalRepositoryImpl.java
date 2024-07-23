package com.jt2024.v5.autowired.spring.repository;

import com.jt2024.v5.autowired.spring.model.Animal;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository("animalRepository")
public class HibernateAnimalRepositoryImpl implements AnimalRepository {
    @Override
    public List<Animal> findAll() {
        final Animal animal = new Animal("Bobby", "Dog");
        return Collections.singletonList(animal);
    }
}
