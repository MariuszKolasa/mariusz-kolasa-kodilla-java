package com.kodilla.testing.shape;

public class Triangle implements Shape{
    String shapeName;
    int a;
    int h;

    public Triangle(String shapeName, int a, int h) {
        this.shapeName = shapeName;
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        double f=a*h;
        double shapeField;
        return shapeField=f/2;
    }
}
