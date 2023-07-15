package oop_project.homework.lab1;

public class HarmonicSum {
    public static void main(String[] args) {
        final int MAX_DENOMINATOR = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;

        //from left to right
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator++) {
            sumL2R += 1 / denominator;
        }
        System.out.println("The sum from left to right is " + sumL2R);

        //from right to left
        for (int denominator = MAX_DENOMINATOR; denominator > 0; denominator--) {
            sumR2L += 1 / denominator;
        }
        System.out.println("The sum from right to left is " + sumR2L);

        //absolute difference
        absDiff = Math.abs(sumL2R - sumR2L);
        System.out.println("Their absolute difference is " + absDiff);
    }
}
