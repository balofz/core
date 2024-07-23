package com.jt2024.di;

public class Car {

    private Engine engine;

    public Car() {}

    public void start() {
        engine.start();
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
