package oop_project.homework.lab2;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number items of array 1: ");
        int n1 = sc.nextInt();
        int [] arr1 = new int [n1];
        
        System.out.println("Enter integer array 1: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter number items of array 2: ");
        int n2 = sc.nextInt();
        int [] arr2 = new int [n2];
        
        System.out.println("Enter integer array 2: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println(equals(arr1, arr2));
    }

    public static boolean equals(int [] arr1, int [] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) return false;
            }
        }
        return true;
    }
}
