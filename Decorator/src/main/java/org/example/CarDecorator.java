package org.example;

public class CarDecorator implements Car {
    protected Car car;
    public CarDecorator(Car _car) {
        this.car = _car;
    }

    public void create() {
        this.car.create();
    }
}
