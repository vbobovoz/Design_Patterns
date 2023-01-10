package org.example;

public class Main {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        basicCar.create();
        System.out.println();

        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.create();
        System.out.println();

        Car sportCar = new SportCar(new BasicCar());
        sportCar.create();
        System.out.println();

        Car sportLuxuryCar = new SportCar(new LuxuryCar(new BasicCar()));
        sportLuxuryCar.create();
        System.out.println();
    }
}