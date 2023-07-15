package oop_project.homework.hw5.ex1;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
            + " radius=" + c2.getRadius()
            + " height=" + c2.getHeight()
            + " base area=" + c2.getBaseArea()
            + " area=" + c2.getArea()
            + " volume=" + c2.getVolume());
        System.out.println(c2);
    }
}
