package oop_project.homework.hw5.ex1;

public class TestCircle {
    public static void main(String[] args) {
        Circle cir = new Circle(2, "blue", false);
        System.out.println(cir);
        System.out.println("Perimeter: " + cir.getPerimeter());
        System.out.println("Area: " + cir.getArea());
    }
}
