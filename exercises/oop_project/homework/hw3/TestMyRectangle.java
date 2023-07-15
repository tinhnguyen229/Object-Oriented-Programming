package oop_project.homework.hw3;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 1);
        MyPoint point2 = new MyPoint(3, 2);
        System.out.println(point1 + " " + point2);
        MyRectangle rectangle = new MyRectangle(point1, point2);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
