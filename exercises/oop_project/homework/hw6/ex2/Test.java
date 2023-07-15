package oop_project.homework.hw6.ex2;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        
        Rectangle rectangle = new Rectangle(2,3);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
