package oop_project.homework.hw4;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        System.out.println(ball);
        for (int step = 0; step < 20; step++) {
            ball.move();
            System.out.println(box.collides(ball));
            System.out.println(ball);
        }
        System.out.println(box.collides(ball));
    }
}
