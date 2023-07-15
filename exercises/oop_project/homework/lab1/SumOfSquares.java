package oop_project.homework.lab1;

public class SumOfSquares {
    public static void main(String[] args) {
        int sum = 0;
        int LOWER_BOUND = 1;
        int UPPER_BOUND = 100;

        for (int number = LOWER_BOUND; number <= UPPER_BOUND; number++) {
            sum += Math.pow(number,2);
        }
        System.out.println("the sum of the squares of all the numbers from 1 to 100 is " + sum);
    }
}
