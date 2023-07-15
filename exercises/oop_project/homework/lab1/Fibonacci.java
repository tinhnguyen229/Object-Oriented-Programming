package oop_project.homework.lab1;

public class Fibonacci {
    public static void main(String[] args) {
        int fn;
        int fnMinus0 = 0;
        int fnMinus1 = 1;
        int n = 1;
        int nMax = 20;
        int sum = 0;
        double average;

        System.out.println("The first " + nMax + " Fibonacci numbers are: ");
        while(n <= nMax) {
            fn = fnMinus1 + fnMinus0;
            System.out.print(fn + " ");
            sum += fn;
            n++;
            fnMinus1 = fnMinus0;
            fnMinus0 = fn;
        }

        System.out.println(" ");
        average = (double) sum / n;
        System.out.println("Average: " + average);

    }
}
