package com.fredymar.pattern.prototypepattern;

public class Mazda extends Car {

    public final static String MAZDA = "MAZDA";

    public Mazda() {
        brand = "Mazda";
    }

    @Override
    public void build() {
        System.out.println("Buiding a Mazda");
    }

}
