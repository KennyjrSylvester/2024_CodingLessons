package main;

public class Circle extends Shape {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public void setRadius(double newRadius) {

		radius = newRadius;

	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double perimetre() {
		return Math.PI * 2 * radius;

	}


}

