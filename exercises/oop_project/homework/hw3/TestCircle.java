package oop_project.homework.hw3;

public class TestCircle {
    public static void main(String[] args) {
        Circle cirlce = new Circle(1.1);
        System.out.println(cirlce);
        cirlce.setRadius(2.2);
        System.out.println(cirlce.getArea());
        System.out.println(cirlce.getCircumference());
    }
}
