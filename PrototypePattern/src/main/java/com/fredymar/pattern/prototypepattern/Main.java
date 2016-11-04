package com.fredymar.pattern.prototypepattern;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        CarFactoty.loadCars();
        Car car = CarFactoty.getCar(Mazda.MAZDA);
        System.out.println(car.getBrand());
        
    }

}
