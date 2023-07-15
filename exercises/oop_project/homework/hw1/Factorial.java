package oop_project.homework.hw1;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i ;
        }
        System.out.printf("The Factorial of %d is %d", n, factorial);
    }
}
