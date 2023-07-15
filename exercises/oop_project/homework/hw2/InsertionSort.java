package oop_project.homework.hw2;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr =  input(scanner);
        sort(arr);
        for (int i:arr) {
            System.out.print(i + " ");
        }
    }

    public static void sort(int [] array) {
        if (array == null) return;
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            for (int j = i - 1; j >=0 ; j--) {               
                if (temp < array[j]) {
                    array[j+1] = array[j];                  
                    array[j] = temp;   
                }
            } 
        }
    }

    public static int [] input(Scanner sc) {
        System.out.print("Nhap vao so phan tu: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }


}