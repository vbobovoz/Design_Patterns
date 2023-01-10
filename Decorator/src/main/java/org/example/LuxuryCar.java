package org.example;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car _car) {
        super(_car);
    }

    @Override
    public void create() {
        super.create();
        System.out.print(" Adding some LuxuryCar features.");
    }
}
