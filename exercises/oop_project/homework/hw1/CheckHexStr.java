package oop_project.homework.hw1;
import java.util.Scanner;
public class CheckHexStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a hex string: ");
        String hexStr = scanner.nextLine();
        int countChar = 0;
        for (int index = 0; index < hexStr.length(); index++) {
            char inChar = hexStr.charAt(index);
            if ((inChar >= '0' && inChar <= '9') || (inChar >= 'a' && inChar <= 'f') || (inChar >= 'A' && inChar <= 'F') || inChar == ' ') {
                countChar++;
            }
        }

        if (countChar == hexStr.length()) {
            System.out.printf("\"%s\" is a hex string.", hexStr);
        } else {
            System.out.printf("\"%s\" isn't a hex string.", hexStr);
        }
    }
}
