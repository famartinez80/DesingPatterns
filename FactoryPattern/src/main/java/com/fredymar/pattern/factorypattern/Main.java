package com.fredymar.pattern.factorypattern;

public class Main {

    public static void main(String[] args) {
        Shape shape = new ShapeFactory().getShape(ShapeFactory.CIRCLE);
        shape.draw();
    }
}
