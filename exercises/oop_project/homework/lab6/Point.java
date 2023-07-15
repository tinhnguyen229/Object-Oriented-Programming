package oop_project.homework.lab6;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
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

    public int[] getXY() {
        int[] xy = {this.x, this.y};
        return xy;
    }

    public double distance(Point another) {
        int diffX = this.x - another.x;
        int diffY = this.y - another.y;
        return Math.sqrt((diffX * diffX) + (diffY * diffY));
    }

    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}