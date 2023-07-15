package oop_project.homework.hw5.ex1;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point = new Point3D(1,2,3);
        System.out.println(point);
        point.setXYZ(1, 1, 1);
        System.out.println(point);
        point.setXY(2, 3);
        System.out.println(point);
        float[] p = point.getXYZ();
        for(float i : p) System.out.println(i + " ");
        System.out.println(point.getZ());
    }
}
