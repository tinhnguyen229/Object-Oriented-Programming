package oop_project.homework.hw1;
public class TimeTable {
    public static void main(String[] args) {
        int size = 12;
        for(int row = 1; row <= size; row++) {
            if(row == 1) {
                System.out.printf("%4c %c",'*','|');
                for(int col = 1; col < size - 1; col++) {
                    System.out.printf("%4d", col);
                }
                System.out.println();

            } else if (row == 2) {
                for(int col = 1; col <= size; col++){
                    System.out.print("----");
                }
                System.out.println();

            } else {
                System.out.printf("%4d |", (row-2));
                for(int col = 1; col <= size-2; col++) {
                    System.out.printf("%4d", ((row - 2) * col));
                }
                System.out.println();

            }
        }
    }
}
