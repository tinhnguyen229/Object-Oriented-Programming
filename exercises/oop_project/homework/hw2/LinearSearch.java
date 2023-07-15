package oop_project.homework.hw2;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of list : ");
        int length = scanner.nextInt();
        int [] list = new int[length];

        for (int index = 0; index < length; index++) {
            list[index] = scanner.nextInt();
        }

        System.out.print("Enter element to search : ");
        int search = scanner.nextInt();
        int elementAt = search(list, search);

        String result = elementAt == -1 ? "Element not found." : "Element is at index " + elementAt;
        System.out.println(result);
    }

    public static int search(int [] list, int search) {
        if (list == null) return -1;
        int length = list.length;
        for (int index = 0; index < length; index++) {
            if (list[index] == search) {
                return index;
            }
        }
        return -1;
    }
}