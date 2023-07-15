package oop_project.homework.lab2;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number items of array: ");
        int n = sc.nextInt();
        int [] arrInt = new int [n];
        
        System.out.println("Enter integer array: ");
        for (int i = 0; i < n; i++) {
            arrInt[i] = sc.nextInt();
        }

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        if (contains(arrInt, key)) {
            System.out.println("Array contains " + "\""+ key + "\" !");
        } else {
            System.out.println("Array not contains " + "\""+ key + "\" !");
        }
    }

    public static boolean contains (int [] arr, int key) {
        for (int value:arr) {
            if (value == key) return true;
        }
        return false;
    }
}
