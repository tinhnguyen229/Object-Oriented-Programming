package oop_project.homework.hw2;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.printf("The greatest common divisor of (%d, %d) is %d !", a, b, gcd(a,b));
    }

    public static int gcd(int a, int b) {
        while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
	    }
		return a;
    }
}
