package oop_project.homework.hw1;
import java.util.Scanner;
public class DecipherCaesarCode {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.print("Enter a ciphertext string: "); 
        String inStr = scanner.next().toLowerCase();
        
        String plainText = "";
        int shiftKey = 3;
        for (int index = 0; index < inStr.length(); index++) {
            int charPosition = ALPHABET.indexOf(inStr.charAt(index));
            int keyValue = (charPosition - shiftKey) % 26;
            if (keyValue < 0) {
                keyValue = ALPHABET.length() + keyValue;
            }
            char replaceValue = ALPHABET.charAt(keyValue);
            plainText += replaceValue;
        }
        System.out.println("The plaintext string is: " + plainText.toUpperCase());
    }
}
