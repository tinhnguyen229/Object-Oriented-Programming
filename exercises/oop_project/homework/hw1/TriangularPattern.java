package oop_project.homework.hw1;
import java.util.Scanner;
public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        System.out.println("--A--");
        for (int row = 1; row <= size; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print("#" + " ");
            }
            System.out.println();
        }

        System.out.println("--B--");
        for (int row = size; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("#" + " ");
            }
            System.out.println();
        }

        System.out.println("--C--");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row > col) {
                    System.out.print("  ");
                } else {
                    System.out.print("#" + " ");
                }
            }
            System.out.println();
        }

        System.out.println("--D--");
        for (int row = size; row >= 1; row--) {
            for (int col = 1; col <= size; col++) {
                if (col < row) {
                    System.out.print("  ");
                } else {
                    System.out.print("#" + " ");
                }
            }
            System.out.println();
        }
    }
}
