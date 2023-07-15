package oop_project.homework.hw2;
public class FibonacciInt {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 0; i < n; i++) {
            int fibo = fibonacci(i);
            if (fibonacci(i) >= 0 && fibonacci(i) <= Integer.MAX_VALUE) {
                System.out.printf("F(%d) = %d \n", i, fibo);
            } else {
                System.out.printf("F(%d) is out of the range of int \n", i);
                break;
            }
        }
    }

    public static int fibonacci(int nMax) {
        int fn = 1;
        int f0 = 0;
        int f1 = 1;
        if (nMax == 0 || nMax == 1) {
            return nMax;
        } else {
            for (int i = 2; i < nMax; i++) {
                f0 = f1;
                f1 = fn;
                fn = f1 + f0;
            }
        }
        return fn;
    }
}
