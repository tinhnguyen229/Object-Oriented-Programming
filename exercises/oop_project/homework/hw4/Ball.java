package oop_project.homework.hw4;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
    
    public Ball() {
        
    }

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = speed * (float) Math.cos(Math.toRadians(direction));
        this.yDelta = speed * (float) Math.sin(Math.toRadians(direction));;
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

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getXDelta() {
        return this.xDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public float getYDelta() {
        return this.yDelta;
    }

    public void move() {
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    public void reflectHorizontal() {
        this.xDelta = -this.xDelta;
    }

    public void reflectVertical() {
        this.yDelta = -this.yDelta;
    }

    public String toString() {
        return String.format("Ball [(%.1f, %.1f), speed = (%.1f, %.1f)]"
                            , this.x, this.y, this.xDelta, this.yDelta);
    }
}
