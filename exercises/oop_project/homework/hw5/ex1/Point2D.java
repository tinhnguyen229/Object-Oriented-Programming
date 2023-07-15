package oop_project.homework.hw5.ex1;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return this.x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return this.y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float [] getXY() {
        float [] xy = {this.x, this.y};
        return xy;
    }

    public String toString() {
        return String.format("(%.2f, %.2f)", this.x, this.y);
    }
}
