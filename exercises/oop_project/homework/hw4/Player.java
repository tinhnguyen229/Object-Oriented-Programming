package oop_project.homework.hw4;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump(float zDisp) {
        this.z = zDisp;
    }

    public boolean near(BallPlaying ball) {
        double diffX = (double) ball.getX() - this.x;
        double diffY = (double) ball.getY() - this.y;
        double diffZ = (double) ball.getZ() - this.z;
        float distance = (float) Math.sqrt((diffX * diffX) + (diffY * diffY) + (diffZ * diffZ));
        if (distance < 8.0) return true;
        return false;
    }

    public void kick(BallPlaying ball) {
        float power = 3;
        if (this.x == ball.getX() 
            && this.y == ball.getY() 
            && this.z == ball.getZ())
        {
            ball.setXYZ(ball.getX() + power, ball.getY() + power, ball.getZ() + power);
        }
    }
}
