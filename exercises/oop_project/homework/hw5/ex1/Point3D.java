package oop_project.homework.hw5.ex1;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        super();
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);;
        this.z = z;
    }

    public float[] getXYZ() {
        float[] xyz = {this.getX(), this.getY(), this.z};
        return xyz;
    }

    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", this.getX(), this.getY(), this.z);
    }
}
