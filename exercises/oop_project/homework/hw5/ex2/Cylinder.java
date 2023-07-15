package oop_project.homework.hw5.ex2;

public class Cylinder {
    private Circle base;
    private double height;
    
    public Cylinder() {
        base = new Circle();
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        this.base = new Circle(radius);
    }

    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        this.base = new Circle(radius, color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return base.getArea() * this.height ;
    }

    public String toString() {
        return String.format("Cylinder[%s, height = %.2f]"
                            , base.toString(), this.height);
    }
}
