package oop_project.homework.hw6.ex4;

public class Test {
    public static void main(String[] args) {
        MovableCircle mCircle = new MovableCircle(2, 3, 1, 1, 3);
        System.out.println(mCircle);
        mCircle.moveUp();
        mCircle.moveLeft();
        System.out.println(mCircle);
    }
}
