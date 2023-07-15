package oop_project.homework.hw6.ex1;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.getLength();
    }

    public void setSide(double  side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side) {
        this.setSide(side);
    }

    public void setLength(double side) {
        this.setSide(side);
    }

    public String toString() {
        return String.format("Square [%s]", super.toString());
    }
}
