package oop_project.homework.lab2;

import java.util.Scanner;

public class Copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number items of array: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        
        System.out.println("Enter integer array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i:copyOf(arr)){
            System.out.print(i + " ");
        }
        
        System.out.println();
        System.out.print("Enter new length: ");
        int newLength = sc.nextInt();
        
        for (int i:copyOf(arr, newLength)){
            System.out.print(i + " ");
        }
    }

    public static int [] copyOf(int [] arr) {
        if (arr == null) return null;
        
        int [] newArr = new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int [] copyOf(int [] arr, int newLength) {
        if (arr == null) return null;
        if (arr.length < newLength) {
            int [] newArr = new int [newLength];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            return newArr;
        } else {
            int [] newArr = new int [newLength];
            for (int i = 0; i < newLength; i++) {
                newArr[i] = arr[i];
            }
            return newArr;
        } 
    }
}
