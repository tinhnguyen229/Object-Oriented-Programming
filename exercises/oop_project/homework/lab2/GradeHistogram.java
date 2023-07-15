package oop_project.homework.lab2;

import java.util.Scanner;

public class GradeHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] grades = inputGrade(sc);
        horizontal(grades);
        vertical(grades);
    }

    public static int [] inputGrade(Scanner sc) {
        System.out.print("Enter number of student: ");
        int numStudent = sc.nextInt();
        int [] grades = new int [numStudent];
        for (int i = 0; i < numStudent; i++) {
            while (true) {
                System.out.print("Enter grade for student " + (i + 1) + ": ");
                grades[i] = sc.nextInt();
                if (grades[i] >= 0 && grades[i] <= 100) {
                    break;
                } else {
                    System.out.println("Enter again ! (grade between 0 and 100).");
                }
            }
        }
        return grades;
    }

    public static void horizontal(int [] arr) {
        System.out.println("------------------Horizontal Histograms------------------");
        int [] count = countGrade(arr);

        for (int row = 0; row < 10; row++) {
            if (row == 0) {
                System.out.print(" " + (row * 10) + " -  " + (row * 10 + 9) + ": ");
                int i = 0;
                while (i < count[row]) {
                    System.out.print("*");
                    i++;
                }
                System.out.println();

            } else if (row == 9) {
                System.out.print((row * 10) + " -" + (row * 10 + 10) + ": ");
                int i = 0;
                while (i < count[row]) {
                    System.out.print("*");
                    i++;
                }
                System.out.println();

            } else {
                System.out.print((row * 10) + " - " + (row * 10 + 9) + ": ");
                int i = 0;
                while (i < count[row]) {
                    System.out.print("*");
                    i++;
                }
                System.out.println();
            }
        }
    }

    public static void vertical(int [] arr) {
        System.out.println("------------------Vertical Histograms------------------");
        int [] count = countGrade(arr);
        // group has most value
        int rowMax = countMax(count);
        boolean [][] check = new boolean [rowMax][10];
        for (int row = 0; row < rowMax; row++) {
            for (int col = 0; col < 10; col++) {
                if (count[col] >= 1) {
                    check [row][col] = true;
                    count[col]--;
                }
            }
        }

        for (int row = rowMax - 1; row >= 0; row--) {
            for (int col = 0; col < 10; col++) {
                if (col == 0) {
                    if (check[row][col]) {
                        System.out.printf("\t*");
                    } else {
                        System.out.printf("\t ");
                    }
                } else {
                    if (check[row][col]) {
                        System.out.printf(" \t\t*");
                    } else {
                        System.out.printf(" \t\t ");
                    }
                }
            }
            System.out.println();
        }
    
        for (int col = 0; col < 10; col++) {
            if (col == 0) {
                System.out.printf("      [%d-%d]", (col * 10), (col * 10 + 9));
            } else if (col == 9) {
                System.out.printf("\t   [%d - %d]", (col * 10), (col * 10 + 10));
            } else {
                System.out.printf("  \t    [%d - %d]", (col * 10), (col * 10 + 9));
            }
        }
    }

    public static int [] countGrade(int [] arr) {
        int [] count = new int [10];
        for (int i = 0; i < arr.length; i++) {
            int grade = arr[i];
            if (grade <= 9) {
                count[0]++;
            } else if (grade <= 19) {
                count[1]++;
            } else if (grade <= 29) {
                count[2]++;
            } else if (grade <= 39) {
                count[3]++;
            } else if (grade <= 49) {
                count[4]++;
            } else if (grade <= 59) {
                count[5]++;
            } else if (grade <= 69) {
                count[6]++;
            } else if (grade <= 79) {
                count[7]++;
            } else if (grade <= 89) {
                count[8]++;
            } else {
                count[9]++;
            }
        }
        return count;
    }

    public static int countMax(int [] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
