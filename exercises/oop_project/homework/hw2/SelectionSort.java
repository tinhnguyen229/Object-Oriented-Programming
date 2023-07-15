package oop_project.homework.hw2;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = input(sc);
        sort(array);
        System.out.print("Dãy đã sắp xếp: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void sort(int [] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            System.out.println("Pass " + (i + 1));
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            
            for (int k : arr) {
                System.out.print(k + " ");
            }
            System.out.println(" ");
        }
        System.out.println("DONE!");
    }

    public static int[] input(Scanner scanner) {
        System.out.print("Nhập số phần tử: ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

}
