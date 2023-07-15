package oop_project.homework.hw2;
import java.util.Scanner;
import java.util.Random;
public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        final int SECRET_NUMBER = rd.nextInt(100);
        System.out.println(SECRET_NUMBER);
        System.out.print("Enter number of trial: ");
        int n = sc.nextInt();

        System.out.println("Key in your guess:");
        int count = 1;
        while (count <= n) {
            int guess = sc.nextInt();
            if (guess != SECRET_NUMBER && count == n ) {
                System.out.print("");
            } else if (guess < SECRET_NUMBER) {
                System.out.println("Try higher!");
            } else if (guess > SECRET_NUMBER) {
                System.out.println("Try lower!");
            } else {
                System.out.println("Success!");
                System.out.printf("You got it in %d trials \n", count);
                break;
            }
            count++;
        }
        if (count == n + 1) {
            System.out.printf("You got it in %d trials \n", count - 1);
        }
    }
}
