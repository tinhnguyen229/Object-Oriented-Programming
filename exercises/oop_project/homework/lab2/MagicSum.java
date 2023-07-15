package oop_project.homework.lab2;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        final int SENTINAL = -1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (or -1 to end): ");
        int n = sc.nextInt();
        int sum;
        if (hasEight(n)) {
            sum = n;
        } else {
            sum = 0;
        }
        while (n != SENTINAL) {
            System.out.print("Enter a positive integer (or -1 to end): ");
            n = sc.nextInt();
            if (hasEight(n)) {sum += n;}
            
        }
        System.out.println("The magic sum is: " + sum);
    }

    public static boolean hasEight(int number) {
        while(number > 0) {
            int digit = number % 10;
            if (digit == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
