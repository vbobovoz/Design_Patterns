package org.example;

public class SportCar extends CarDecorator {
    public SportCar(Car _car) {
        super(_car);
    }

    @Override
    public void create() {
        super.create();
        System.out.print(" Adding some SportCar features.");
    }
}
