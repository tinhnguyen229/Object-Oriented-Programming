package oop_project.homework.hw3;

public class Rectangle {
    private float width;
    private float length;
    
    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(float l, float w) {
        this.length = l;
        this.width = w;
    }

    public void setLength(float l) {
        this.length = l;
    }

    public float getLength() {
        return this.length;
    }

    public void setWidth(float w) {
        this.width = w;
    }

    public float getWidth() {
        return this.width;
    }

    public float getArea() {
        return this.length * this.width;
    }

    public float getPerimeter() {
        return (this.length + this.width) * 2;
    }

    public String toString() {
        return "Rectangle [Length = " + this.length + ", Width = " + this.width + "]";
    }

}
