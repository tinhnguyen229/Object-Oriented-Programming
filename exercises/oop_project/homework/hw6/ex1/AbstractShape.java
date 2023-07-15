package oop_project.homework.hw6.ex1;

public abstract class AbstractShape {
    protected String color;
    protected boolean filled;

    public AbstractShape() {
        this.color = "red";
        this.filled = true;
    }

    public AbstractShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter(); 

    public String toString() {
        return String.format("Shape[color = %s, filled = %s]"
                            , this.color, this.filled ? "Filled" : "Not Filled");
    }
}