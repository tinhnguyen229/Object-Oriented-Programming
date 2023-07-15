package oop_project.homework.hw1;
import java.util.Scanner;
public class HillPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int numRow = sc.nextInt();
        int numCol = 2 * numRow - 1;

        System.out.println("--A--");
        for (int row = 1; row <= numRow; row++) {
            for(int col = 1; col <= numCol; col++) {
                if ((row + col >= numRow + 1) && (row >= col - numRow + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("--B--");
        for (int row = numRow; row >= 1; row--) {
            for (int col = 1; col <= row * 2 -1; col++) { 
                System.out.print("# "); 
            } 
            System.out.println(); 
            for (int col = numRow; col >= row; col--) {
                System.out.print("  ");
            }
        }

        System.out.println("--C--");
        for (int row = 1; row <= numRow; row++) {
            for(int col = 1; col <= numCol; col++) {
                if ((row + col >= numRow + 1) && (row >= col - numRow + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int row = numRow - 1; row >= 1; row--) {
            for (int col = numRow -1; col >= row; col--) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row * 2 -1; col++) { 
                System.out.print("# "); 
            } 
            System.out.println();
            
        }

        System.out.println("--D--");
        for (int row = 1; row <= numRow; row++) {
            for (int col = row; col <= numRow; col++) {
                System.out.print("# ");
            }
            for (int col = 1; col <= row * 2 - 2; col++) {
                System.out.print("  ");
            }
            for (int col = row; col <= numRow; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        
        for (int row = 1; row <= numRow; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("# ");
            }
            for (int k = (row * 2) - 2; k < (numRow * 2) - 2; k++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
