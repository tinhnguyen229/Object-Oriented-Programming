package oop_project.homework.hw3;

public class MyPoint {
    private int x;
    private int y;
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int [] getXY() {
        int [] xy = new int [2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }

    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }

    public double distance(int x, int y) {
        return Math.round(Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)) * 100.0) / 100.0;
    }

    public double distance(MyPoint point) {
        return Math.round(Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2)) * 100.0) / 100.0;
    }
    
    public double distance() {
        return Math.round(Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)) * 100.0) / 100.0;
    }

}
