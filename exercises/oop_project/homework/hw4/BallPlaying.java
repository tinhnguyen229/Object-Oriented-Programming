package oop_project.homework.hw4;

public class BallPlaying {
    private float x;
    private float y;
    private float z;

    public BallPlaying(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getZ() {
        return this.z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String toString() {
        return String.format("(%.1f, %.1f, %.1f)"
                            , this.x, this.y, this.z);
    }
}
