package com.kodilla.testing.shape;

public class Circle implements Shape{
    String shapeName;
    int a;

    public Circle(String shapeName, int a) {
        this.shapeName = shapeName;
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        double shapeField=a*a*3.14;
        return shapeField;
    }
}
