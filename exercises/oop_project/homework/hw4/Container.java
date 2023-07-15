package oop_project.homework.hw4;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = this.x1 + width;
        this.y2 = this.x1 + height;
    }

    public int getX() {
        return this.x1;
    }

    public int getY() {
        return this.y1;
    }

    public int getWidth() {
        return this.x2 - this.x1;
    }

    public int getHeight() {
        return this.y2 - this.y1;
    }

    public boolean collides(Ball ball) {
        if ((ball.getX() - ball.getRadius() <= this.x1) ||
            (ball.getX() + ball.getRadius() >= this.x2))
        {
            ball.reflectHorizontal();
            return true;
        }

        if ((ball.getY() - ball.getRadius() <= this.y1) ||
            (ball.getY() + ball.getRadius() >= this.y2))
        {
            ball.reflectVertical();
            return true;
        }

        return false;
    }

    public String toString() {
        return String.format("Container [(%d, %d), (%d, %d)]"
                            , this.x1, this.y1, this.x2, this.y2);
    }
}
