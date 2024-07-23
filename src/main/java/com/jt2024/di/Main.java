package com.jt2024.di;

public class Main {
    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        Car petrolCar = new Car();
        petrolCar.setEngine(petrolEngine);
        petrolCar.start(); // Outputs: Petrol Engine started

        Engine electricEngine = new ElectricEngine();
        Car electricCar = new Car();
        electricCar.setEngine(electricEngine);
        electricCar.start(); // Outputs: Electric Engine started
    }
}
