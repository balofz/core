package com.jt2024.v1.no.spring.repository;

import com.jt2024.v1.no.spring.model.Animal;

import java.util.List;

public interface AnimalRepository {
    List<Animal> findAll();
}
