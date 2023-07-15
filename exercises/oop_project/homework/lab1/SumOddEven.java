package oop_project.homework.lab1;

public class SumOddEven {
    public static void main(String[] args) {
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff = 0;
        int LOWER_BOUND = 0;
        int UPPER_BOUND = 100;

        //Computer sum
        for (int number = 0; number <= UPPER_BOUND; number++) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        //Compute absolute difference
        int abs = Math.abs(sumEven - sumOdd);

        System.out.println("Sum of odd numbers is " + sumOdd);
        System.out.println("Sum of even numbers is " + sumEven);
        System.out.println("Their absolute difference is " + abs);
    }
}
