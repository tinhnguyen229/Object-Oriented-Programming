package oop_project.homework.hw6.ex5;

public class Circle implements IGeometricObject {
    protected double radius;
    
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return String.format("Circle[radius = %.2f]", this.radius);
    }
}
