package oop_project.homework.hw3;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle cir1 = new MyCircle(new MyPoint(3, 4), 5);
        MyCircle cir2 = new MyCircle(new MyPoint(10, 20), 5);
        System.out.println(cir1);
        System.out.println(cir2);
        System.out.println(cir1.getArea());
        System.out.println(cir1.getCircumference());
        System.out.println(cir1.distance(cir2));
    }
}
