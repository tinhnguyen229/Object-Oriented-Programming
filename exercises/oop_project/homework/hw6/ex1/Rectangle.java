package oop_project.homework.hw6.ex1;

public class Rectangle extends AbstractShape {
    private double width;
    private double length;

    public Rectangle() {
        super();
        this.width  = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width  = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width  = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    public String toString() {
        return String.format("Rectangle [%s, width = %.2f, length = %.2f]"
                            , super.toString(), this.width, this.length);
    }
}
