package oop_project.homework.hw3;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double r) {
        this.radius = r;
        this.color = "red";
    }

    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }    
    public void setRadius(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return "Circle [radius = " + this.radius + ", color = " + this.color + "]";
    }
}
