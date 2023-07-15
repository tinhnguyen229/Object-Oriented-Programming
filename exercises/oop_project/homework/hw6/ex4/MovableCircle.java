package oop_project.homework.hw6.ex4;

public class MovableCircle implements IMovable{
    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        this.center.y += this.center.ySpeed; 
    }

    @Override
    public void moveDown() {
        this.center.y -= this.center.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.center.x -= this.center.xSpeed; 
    }

    @Override
    public void moveRight() {
        this.center.x += this.center.xSpeed; 
    }
    
    public String toString() {
        return String.format("MovableCircle[%s, radius = %d]"
                            , this.center.toString(), this.radius);
    }
}
