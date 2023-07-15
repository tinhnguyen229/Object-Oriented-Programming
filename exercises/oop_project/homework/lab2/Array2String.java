package oop_project.homework.lab2;

import java.util.Scanner;

public class Array2String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of array: ");
        int n = sc.nextInt();
        int[] arrInt = new int[n];

        System.out.println("Enter integer array: ");
        for (int i = 0; i < n; i++) {
            arrInt[i] = sc.nextInt();
        }

        System.out.println(arrayToString(arrInt));
    }

    public static String arrayToString(int[] arr) {
        String res = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            res += arr[i] + ", ";
        }
        res += arr[arr.length - 1] + "]";
        return res;
    }
}
