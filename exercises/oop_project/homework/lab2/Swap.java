package oop_project.homework.lab2;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr1 = input(sc);
        int [] arr2 = input(sc);
        print(arr1);
        print(arr2);
        System.out.println(swap(arr1, arr2));
        print(arr1);
        print(arr2);
    }

    public static int[] input(Scanner sc) {
        System.out.print("Enter number items of array: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter integer array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void print(int[] arr) {
        if (arr == null) return;
        System.out.print("[ ");
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.print("]");
        System.out.println();
    }
    public static boolean swap(int [] arr1, int [] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Can't swap");
            return false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }
        }
        return true;
    }
}
