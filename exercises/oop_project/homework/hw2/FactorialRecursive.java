package oop_project.homework.hw2;
public class FactorialRecursive {
    public static void main(String[] args) {
        int n = 35;
        if (0 < factorial(n) && factorial(n) <= Integer.MAX_VALUE) {
            System.out.println(factorial(n));
        } else {
            System.out.println("Out of memory");
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
