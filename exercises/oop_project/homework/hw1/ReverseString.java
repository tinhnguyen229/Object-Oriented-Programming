package oop_project.homework.hw1;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = scanner.next();
        String reverseString = "";
        for (int index = inStr.length() -1; index >=0; index--) {
            reverseString += inStr.charAt(index);
        }

        System.out.printf("The reverse of the String \"%s\" is \"%s\".",inStr,reverseString);
    }
}
