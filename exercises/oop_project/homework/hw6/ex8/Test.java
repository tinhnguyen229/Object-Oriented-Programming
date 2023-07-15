package oop_project.homework.hw6.ex8;

public class Test {
    public static void main(String[] args) {
        IMovable m1 = new MovableRectangle(0, 0, 20, 20, 5, 5);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
           
        IMovable m2 = new MovableRectangle(0, 0, 20, 20, 5, 5);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
        System.out.println(m1 instanceof IMovable);
    }
}
