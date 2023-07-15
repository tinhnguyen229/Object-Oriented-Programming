package oop_project.homework.hw3;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(2, 3);
        MyPoint point2 = new MyPoint(1, 3);
        MyPoint point3 = new MyPoint(4, 2);
        
        MyTriangle triangle = new MyTriangle(point1, point2, point3);
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getType());

        MyTriangle triangle2 = new MyTriangle(4, 5, 2, 6, 3, 7);
        System.out.println(triangle2);
        System.out.println(triangle2.getPerimeter());
        System.out.println(triangle2.getType());
    }
}
