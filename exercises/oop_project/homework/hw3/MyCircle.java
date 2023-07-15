package oop_project.homework.hw3;

public class MyCircle {
    private MyPoint center = new MyPoint();
    private int radius = 1;
    
    public MyCircle() {

    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public MyPoint getCenter() {
        return this.center;
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterX() {
        return this.center.getX();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int getCenterY() {
        return this.center.getY();
    }

    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }

    public int [] getCenterXY() {
        return this.center.getXY();
    }

    public String toString() {
        return String.format("MyCircle [radius = %d, center = %s]"
                            , this.radius, this.center.toString());
    }

    public double getArea() {
        return Math.round(Math.PI * Math.pow(this.radius, 2) * 100.0) / 100.0;
    }

    public double getCircumference() {
        return Math.round(2 * Math.PI * this.radius * 100.0) / 100.0;
    }

    public double distance(MyCircle another) {
        return this.center.distance(another.center);
    }
}
