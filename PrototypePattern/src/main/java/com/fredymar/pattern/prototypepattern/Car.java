package com.fredymar.pattern.prototypepattern;

public abstract class Car implements Cloneable {

    protected String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract void build();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
