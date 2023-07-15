package oop_project.homework.hw4;

public class TestPlayer {
    public static void main(String[] args) {
        BallPlaying ball = new BallPlaying(5, 5, 5);
        System.out.println(ball);
        Player player = new Player(1, 5, 5);
        System.out.println(player.near(ball));
        player.jump(5);
        player.kick(ball);
        System.out.println(ball);
    }
}
