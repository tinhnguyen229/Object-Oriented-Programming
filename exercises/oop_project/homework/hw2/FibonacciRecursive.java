package oop_project.homework.hw2;
public class FibonacciRecursive {
    public static void main(String[] args) {
        int n = 100;
        int res = fibo(n);
        if (res >= 0 && res <= Integer.MAX_VALUE) {
            System.out.println(res);
        } else {
            System.out.println("Out of memory!");
        }
    }

    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
