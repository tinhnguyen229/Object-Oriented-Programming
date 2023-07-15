package oop_project.homework.lab1;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        int LOWER_BOUND = 1;
        int UPPER_BOUND = 100;

        //Use for-loop
        for (int number = LOWER_BOUND; number <= UPPER_BOUND; number++) {
            sum += number;
        }
        average = (double) sum / 100;

        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The average is " + average );

        //Use while-do loop
        int sumWhile = 0;
        int numberWhile = LOWER_BOUND;
        while (numberWhile <= UPPER_BOUND) {
            sumWhile += numberWhile;
            numberWhile++;
        }
        System.out.println("The sum of 1 to 100 is " + sumWhile);

        //Use do-while loop
        int sumDo = 0;
        int numberDo = LOWER_BOUND;
        do {
            sumDo += numberDo;
            numberDo++;
        } while (numberDo <= UPPER_BOUND);
        System.out.println("The sum of 1 to 100 is " + sumDo);
    }
}
