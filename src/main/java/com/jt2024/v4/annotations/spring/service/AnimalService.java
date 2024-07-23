package com.jt2024.v4.annotations.spring.service;

import com.jt2024.v4.annotations.spring.model.Animal;

import java.util.List;

public interface AnimalService {
    List<Animal> findAll();
}
