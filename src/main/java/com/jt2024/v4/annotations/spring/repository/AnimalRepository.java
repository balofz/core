package com.jt2024.v4.annotations.spring.repository;

import com.jt2024.v4.annotations.spring.model.Animal;

import java.util.List;

public interface AnimalRepository {
    List<Animal> findAll();
}
