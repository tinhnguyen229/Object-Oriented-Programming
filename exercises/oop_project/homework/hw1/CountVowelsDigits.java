package oop_project.homework.hw1;
import java.util.Scanner;
public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = scanner.next();
        inStr = inStr.toLowerCase();
        int countVowels = 0;
        int countDigits = 0;
        for (int index = 0; index < inStr.length(); index++){
            if (inStr.charAt(index) == 'a' || inStr.charAt(index) == 'e' || inStr.charAt(index) == 'i' || inStr.charAt(index) == 'o' || inStr.charAt(index) == 'u'){
                countVowels += 1;
            }else if (inStr.charAt(index) >= '0' && inStr.charAt(index) <= '9') {
                countDigits += 1;
            }
        }

        double perVowels = (double) countVowels / inStr.length() * 100.0;
        double perDigits = (double) countDigits / inStr.length() * 100.0;
        
        System.out.printf("Number of voweks: %d (%.2f%%)\n", countVowels, perVowels);
        System.out.printf("Number of digits: %d (%.2f%%)", countDigits, perDigits);
    }
}
