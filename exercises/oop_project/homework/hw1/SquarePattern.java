package oop_project.homework.hw1;
public class SquarePattern {
    public static void main(String[] args) {
        int size = 5;
        for(int row = 1; row <= size; row++) {
            for(int col = 1; col <= size; col++) {
                System.out.print("#" + " ");
            }
            System.out.println();
        }

        System.out.println();
        int row = 1;
        while(row <= size){
            int col = 1;
            while(col <= size){
                System.out.print("#" + " ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
