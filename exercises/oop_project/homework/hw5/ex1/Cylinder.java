package oop_project.homework.hw5.ex1;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
        super();
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return this.getBaseArea() * this.height ;
    }

    public double getBaseArea() {
        return super.getArea();
    }

    @Override
    public double getArea() {
        return 2 * this.getBaseArea() + getPerimeter() * this.height ;
    }

    @Override
    public String toString() {
        return String.format("Cylinder [%s, height = %.2f]", super.toString(), this.height);
    }
}
