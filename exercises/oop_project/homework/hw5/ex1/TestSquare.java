package oop_project.homework.hw5.ex1;

public class TestSquare {
    public static void main(String[] args) {
        Square sq = new Square(5, "black", false);
        System.out.println(sq);
        sq.setFilled(true);
        sq.setColor("green");
        sq.setSide(10);
        System.out.println(sq);
    }
}
