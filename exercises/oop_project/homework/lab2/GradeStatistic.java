package oop_project.homework.lab2;

import java.util.Scanner;

public class GradeStatistic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] grades = readGrades(sc);
        print(grades);
        System.out.println("The average is: " + average(grades));
        System.out.println("The median is: " + median(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.println("The standard deviation: " + stdDev(grades));
    }

    public static int [] readGrades(Scanner sc) {
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
        return grades;
    }

    public static void print(int [] arr) {
        System.out.print("The grades are: ");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static double average(int [] arr) {
        int sum = 0;
        for (int item:arr) {
            sum += item;
        }
        double avr = Math.round((double) sum / (arr.length) * 100.0) / 100.0; 
        return avr;
    }

    public static double median(int [] arr) {
        // sort min ->  max
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // median
        double med = 0;
        if (arr.length % 2 != 0) {
            med = (double) arr[arr.length / 2];
        } else {
            med = (double) (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
        }
        return med;
    }

    public static double stdDev(int [] arr) {
        double mean = average(arr);
        double std;
        double total = 0;
        for (int item:arr) {
            total += (double) Math.pow(item, 2) - Math.pow(mean, 2);
        }
        std = Math.sqrt(total / arr.length);
        return Math.round(std * 100.0) / 100.0;
    }

    public static int min(int [] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int [] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

