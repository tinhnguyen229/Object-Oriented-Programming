package oop_project.homework.hw6.ex8;

public class MovablePoint implements IMovable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint() {

    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x      = x;
        this.y      = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.y += this.ySpeed;        
    }

    @Override
    public void moveDown() {
        this.y -= this.ySpeed;  
    }

    @Override
    public void moveLeft() {
        this.x -= this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += this.xSpeed;
    }

    public String toString() {
        return String.format("MovablePoint[(%d, %d), Speed(%d, %d)]"
                            , this.x, this.y, this.xSpeed, this.ySpeed);
    }
}
