package oop_project.homework.lab2;

import java.util.Scanner;

public class Search {
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

        System.out.println("Index of value: " + search(arrInt, key));

    }

    public static int search (int [] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }


}
