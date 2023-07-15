package oop_project.homework.hw2;
import java.util.Scanner;
public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = sc.nextInt();
        print(upperBound);
    }

    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
		for (int i = 1; i < aPosInt; i++ ) {
			if(aPosInt % i == 0) sum += i;
		}
		if(sum == aPosInt) return true;
		return false;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i <= aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum < 2 * aPosInt) {
            return true;
        }
        return false;
    }

    public static void print(int upperBound) {
        System.out.println("These numbers are perfect: ");
        int countPer = 0;
        int countBound1 = 1;
        while (countBound1 <= upperBound) {
            if (isPerfect(countBound1)) {
                System.out.print(countBound1 + " ");
                countPer++;
            }
            countBound1++;
        }
        System.out.println();
        double res1 = (double) countPer/upperBound * 100.0;
        System.out.printf("[%d perfect numbers found (%.2f%%)]", countPer, res1);
        System.out.println();
        System.out.println(" ");
        System.out.println("These numbers are neither deficient nor perfect: ");
        int countDef = 0;
        int countBound2 = 1;
        while (countBound2 <= upperBound) {
            if (isDeficient(countBound2) == false && isPerfect(countBound2) == false) {
                System.out.print(countBound2 + " ");
                countDef++;
            }
            countBound2++;
        }
        System.out.println();
        double res2 = (double) countDef/upperBound * 100.0;
        System.out.printf("[%d deficient numbers found (%.2f%%)]", countDef, res2);
    }
}
