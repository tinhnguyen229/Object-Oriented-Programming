package oop_project.homework.hw2;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = input(sc);
        sort(arr);
        System.out.print("Mảng sau khi sắp xếp: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static int [] input(Scanner sc) {
        System.out.println("Nhập số phần tử");
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void sort(int [] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("Pass " + (i + 1) + ":");
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                for (int k : array) {
                    System.out.print(k + " ");
                }
                System.out.println(" ");
            }
        }
        System.out.println("DONE!");
    }
}