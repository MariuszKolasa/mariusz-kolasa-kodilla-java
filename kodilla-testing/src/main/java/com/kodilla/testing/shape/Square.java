package com.kodilla.testing.shape;

public class Square implements Shape{
    String shapeName;
    int a;

    public Square(String shapeName, int a) {
        this.shapeName = shapeName;
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        double shapeField;
        return shapeField=a*a;
    }
}
