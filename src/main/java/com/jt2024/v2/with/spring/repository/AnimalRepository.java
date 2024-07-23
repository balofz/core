package com.jt2024.v2.with.spring.repository;

import com.jt2024.v2.with.spring.model.Animal;

import java.util.List;

public interface AnimalRepository {
    List<Animal> findAll();
}
