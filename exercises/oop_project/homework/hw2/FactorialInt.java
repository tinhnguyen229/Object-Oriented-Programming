package oop_project.homework.hw2;
public class FactorialInt {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i < n; i++) {
            if (factorial(i) > 0 && factorial(i) < 2147483647) {
                System.out.printf("The factorial of %d is %d. \n", i, factorial(i));
            } else {
                System.out.printf("The factorial of %d is out of range.", i);
                break;
            }

        }
    }

    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
