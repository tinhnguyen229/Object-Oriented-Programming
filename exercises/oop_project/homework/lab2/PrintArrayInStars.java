package oop_project.homework.lab2;

import java.util.Scanner;

public class PrintArrayInStars {
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

        for (int i = 0; i < NUM_ITEMS; i++) {
            System.out.print(i + ": ");
            int star = 1;
            while (star <= items[i]) {
                System.out.print("*");
                star++;
            }
            System.out.println("(" + items[i] + ")");
        }
    }
}
