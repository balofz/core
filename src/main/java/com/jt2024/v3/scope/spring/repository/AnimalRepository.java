package com.jt2024.v3.scope.spring.repository;

import com.jt2024.v3.scope.spring.model.Animal;

import java.util.List;

public interface AnimalRepository {
    List<Animal> findAll();
}
