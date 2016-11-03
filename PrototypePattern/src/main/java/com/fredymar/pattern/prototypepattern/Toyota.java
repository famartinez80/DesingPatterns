package com.fredymar.pattern.prototypepattern;

public class Toyota extends Car {

    public final static String TOYOTA = "TOYOTA";

    public Toyota() {
        brand = "Toyota";
    }

    @Override
    public void build() {
        System.out.println("Building a Toyota");
    }

}
