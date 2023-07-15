package oop_project.homework.hw2;
public class LengthNumber {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(len(n));
    }

    public static int len (int n) {
        if (n == 1 ) {
            return 1;
        } else {
            return len(n - 1) + numOfDigits(n);
        }
    }

    public static int numOfDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
