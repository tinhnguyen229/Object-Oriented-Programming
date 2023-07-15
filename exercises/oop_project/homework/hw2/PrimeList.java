package oop_project.homework.hw2;
import java.util.Scanner;
public class PrimeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();
        print(upperBound);
    }

    public static boolean isPrime(int aPosInt) {
        if (aPosInt < 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) return false;
        }
        return true;
    }

    public static void print(int bound) {
        int countBound = 1;
        int countPrime = 0;
        while (countBound <= bound) {
            if (isPrime(countBound)) {
                System.out.print(countBound + " ");
                countPrime++;
            }
            countBound++;
        }
        System.out.println();
        
        double res = (double) countPrime / bound * 100.0;
        System.out.printf("[%d primes found (%.2f%%)]", countPrime, res);
    }
}
