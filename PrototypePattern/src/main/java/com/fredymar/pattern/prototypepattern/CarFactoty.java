package com.fredymar.pattern.prototypepattern;

import java.util.HashMap;

public class CarFactoty {

    private static HashMap<String, Car> prototypes = new HashMap<>();

    public static Car getCar(String type) throws CloneNotSupportedException {
        return (Car) prototypes.get(type).clone();
    }

    public static void loadCars() {
        prototypes.put(Mazda.MAZDA, new Mazda());
        prototypes.put(Toyota.TOYOTA, new Toyota());
    }
}
