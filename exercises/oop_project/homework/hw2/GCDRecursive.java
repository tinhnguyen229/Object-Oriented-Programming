package oop_project.homework.hw2;
public class GCDRecursive {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
