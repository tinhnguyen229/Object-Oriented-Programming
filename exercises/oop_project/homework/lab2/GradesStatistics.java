package oop_project.homework.lab2;

import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int numStudent = sc.nextInt();
        int [] grades = new int [numStudent];
        for (int i = 0; i < numStudent; i++) {
            grades[i] = 0;
            while (true) {
                System.out.print("Enter grade for student " + (i+1) + ": ");
                grades[i] = sc.nextInt();
                if (grades[i] >= 0 && grades[i] <= 100) {
                    break;
                } else {
                    System.out.println("Enter grade again (between 0 to 100)!");
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < numStudent; i++) {
            sum += grades[i];
        }
        double average = (double) sum / numStudent;
        System.out.printf("The average is: %.2f \n", average);

        int minGrade = grades[0];
        for (int i = 1; i < numStudent; i++) {
            if (grades[i] < minGrade) minGrade = grades[i];
        }
        System.out.printf("The minimum is: %d \n", minGrade);

        int maxGrade = grades[0];
        for (int i = 1; i < numStudent; i++) {
            if (grades[i] > maxGrade) maxGrade = grades[i];
        }
        System.out.printf("The maximum is: %d \n", maxGrade);
    }
}
