package oop_project.homework.hw1;
import java.util.Scanner;
public class CaesarCode {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.print("Enter a plaintext string: "); 
        String inStr = scanner.next().toLowerCase();
        String cipherText = "";
        int shiftKey = 3;
        for (int index = 0; index < inStr.length(); index++) {
            int charPosition = ALPHABET.indexOf(inStr.charAt(index));
            int keyValue = (shiftKey + charPosition) % 26;

            char replaceVal = ALPHABET.charAt(keyValue);
            cipherText += replaceVal;
        }
        System.out.println("The ciphertext string is: " + cipherText.toUpperCase());
    }
}
