package oop_project.homework.lab1;

public class CountNumber {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        int count = 0;
        int LOWER_BOUND = 111;
        int UPPER_BOUND = 8899;

        for (int number = LOWER_BOUND; number <= UPPER_BOUND; number++) {
            sum += number;
            count++;
        }
        //Compute average
        average = (double) sum / count;
        
        System.out.printf("The sum from %d to %d is %d \n", LOWER_BOUND, UPPER_BOUND, sum);
        System.out.printf("The average is %.2f \n", average);
    }
}
