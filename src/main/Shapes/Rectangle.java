package main.Shapes;

import main.Shape;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width  = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimetre() {
        return 2 * length + 2 * width;

    }

    public double length() {
        return length;
    }

    public double width() {
        return width;
    }
}
