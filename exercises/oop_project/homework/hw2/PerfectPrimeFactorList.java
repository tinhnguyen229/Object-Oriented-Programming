package oop_project.homework.hw2;
import java.util.Scanner;
public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();
        print(upperBound);
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int mul = 1;
        int count = 1;
        while (mul < aPosInt && count < aPosInt) {
            if (isPrime(count) && aPosInt % count == 0) {
                mul *= count;
            }
            count++;
        }
        
        if (mul == aPosInt) {
            return true;
        } else {
            return false;
        }
    }

    public static void print(int bound) {
        int countBound = 1;
        int countPrimeFactor = 0;
        while (countBound <= bound) {
            if (isProductOfPrimeFactors(countBound)) {
                System.out.print(countBound + " ");
                countPrimeFactor++;
            }
            countBound++;
        }
        System.out.println();
        double res = (double) countPrimeFactor / bound * 100.0;
        System.out.printf("[%d primes found (%.2f%%)]", countPrimeFactor, res);
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
}
