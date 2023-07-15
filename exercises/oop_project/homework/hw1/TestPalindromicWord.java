package oop_project.homework.hw1;
import java.util.Scanner;
public class TestPalindromicWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inWord = scanner.next();
        String forWord = inWord.toLowerCase();
        String backWord = "";
        for (int index = forWord.length() - 1; index >= 0; index--) {
            backWord += forWord.charAt(index);
        }
        if (backWord.equals(forWord)) {
            System.out.printf("\"%s\" is a palindrome.", inWord);
        } else {
            System.out.printf("\"%s\" isn't a palindrome.", inWord);
        }
    }
}
