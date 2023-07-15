package oop_project.homework.lab2;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int NUM_ITEMS = Integer.parseInt(sc.nextLine());
        int [] items = new int [NUM_ITEMS];

        System.out.print("Enter the value of all items: ");
        String input = sc.nextLine();
        String [] arrItems = input.split(" ");
        
        for (int i = 0; i < NUM_ITEMS; i++) {
            items[i] = Integer.parseInt(arrItems[i]);
        }
        
        System.out.print("The values are: ");
        for (int i = 0; i < NUM_ITEMS; i++) {
            if (i == 0) {
                System.out.print("[" + items[i] + ", ");
            } else if (i == NUM_ITEMS - 1) {
                System.out.print(items[i] + "]");
            } else {
                System.out.print(items[i] + ", ");
            }
        }

    }
}
