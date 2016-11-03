package com.fredymar.pattern.factorypattern;

public class ShapeFactory {

    public static final String CIRCLE = "CIRCLE";
    public static final String SQUARE = "SQUARE";
    public static final String RECTANGLE = "RECTANGLE";

    public Shape getShape(String type) {
        return CIRCLE.equalsIgnoreCase(type) ? new Circle()
                : SQUARE.equalsIgnoreCase(type) ? new Square()
                : RECTANGLE.equalsIgnoreCase(type) ? new Rectangle()
                : null;
    }

}
