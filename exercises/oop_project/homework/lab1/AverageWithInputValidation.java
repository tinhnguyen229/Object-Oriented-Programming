package oop_project.homework.lab1;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_STUDENT = 3;
        int numberIn;
        double average;
        int sum = 0;
        for(int studenNo = 1; studenNo <= NUM_STUDENT; studenNo++){
            do {
                System.out.printf("Enter the mark (0−100) for student %d: ", studenNo);
                numberIn = sc.nextInt();
                if (numberIn >= 0 && numberIn <= 100){
                    break;
                } else {
                    System.out.println("In valid input, try again . . .");
                }
            } while (true);

            sum += numberIn;
        }
        average = (double)sum/3;
        System.out.printf("The average is %.2f ", average);
    }
}
