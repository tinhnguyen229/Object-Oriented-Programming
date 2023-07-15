package oop_project.homework.hw5.ex2;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, 2, "blue");
        System.out.println(cylinder);
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
