package oop_project.homework.lab2;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = input(sc);
        reverse(arr);
        for (int item:arr) {
            System.out.print(item + " ");
        }
    }

    public static int [] input(Scanner sc) {
        System.out.print("Enter number items of array: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        
        System.out.println("Enter integer array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void reverse(int [] arr) {
        if (arr == null) return;
        for (int forward = 0, backward = arr.length - 1; forward < backward; forward++, backward--) {
            int temp = arr[forward];
            arr[forward] = arr[backward];
            arr[backward] = temp;
        }
    }
}
