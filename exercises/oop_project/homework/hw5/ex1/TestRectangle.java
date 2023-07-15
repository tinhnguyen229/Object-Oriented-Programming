package oop_project.homework.hw5.ex1;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(2, 4, "blue", false);
        System.out.println(rec);
        System.out.println("Perimeter: " + rec.getPerimeter());
        System.out.println("Area: " + rec.getArea());
    }
}
