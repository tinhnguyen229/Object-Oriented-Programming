package oop_project.homework.hw6.ex2;

public class Rectangle implements IGeometricObject {
    private double width;
    private double length;
    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width  = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    public String toString() {
        return String.format("Rectangle[width = %.2f, length = %.2f]", this.width, this.length);
    }
}
