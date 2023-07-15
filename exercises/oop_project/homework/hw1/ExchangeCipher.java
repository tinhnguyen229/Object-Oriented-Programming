package oop_project.homework.hw1;
import java.util.Scanner;
public class ExchangeCipher {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = sc.next().toLowerCase();

        String cipherText =  "";
        for (int index = 0; index < inStr.length(); index++) {

            int charPosition = ALPHABET.indexOf(inStr.charAt(index));
            int cipherPosition = ALPHABET.length() - charPosition - 1;
            cipherText += ALPHABET.charAt(cipherPosition);
        }
        System.out.println("The ciphertext string is: " + cipherText.toUpperCase());
    }
}
