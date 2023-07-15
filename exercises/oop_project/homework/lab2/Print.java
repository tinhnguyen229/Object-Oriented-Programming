package oop_project.homework.lab2;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of array: ");
        int n = sc.nextInt();

        double [] arrDouble = new double [n];
        int [] arrInt = new int [n];
        float [] arrFloat = new float [n];

        for (int a = 1; a <= 3; a++) {
            if (a == 1) {
                System.out.println("Enter double array: ");
                for (int i = 0; i < n; i++) {
                    arrDouble[i] = sc.nextDouble();
                }
            } else if (a == 2) {
                System.out.println("Enter integer array: ");
                for (int i = 0; i < n; i++) {
                    arrInt[i] = sc.nextInt();
                }
            } else {
                System.out.println("Enter float array: ");
                for (int i = 0; i < n; i++) {
                    arrFloat[i] = sc.nextFloat();
                }
            }
        }
        print(arrInt);
        print(arrDouble);
        print(arrFloat);
    }
    
    public static void print(int [] arr) {
        if (arr == null) return;
        System.out.print("The values of integer array are: ");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[" + arr[i] + ", ");
            } else if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void print(double [] arr) {
        if (arr == null) return;
        System.out.print("The values of double array are: ");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[" + arr[i] + ", ");
            } else if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void print(float [] arr) {
        if (arr == null) return;
        System.out.print("The values of float array are: ");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[" + arr[i] + ", ");
            } else if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }
}
