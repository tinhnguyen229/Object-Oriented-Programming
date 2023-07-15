package oop_project.homework.hw1;
import java.util.Scanner;
public class Hex2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hexa = sc.nextLine();
        int countValue = 0;
        for(int index = 0; index < hexa.length(); index++) {
            if ((hexa.charAt(index) >= '0' && hexa.charAt(index) <= '9') || (hexa.charAt(index) >= 'a' && hexa.charAt(index) <= 'f') || (hexa.charAt(index) >= 'A' && hexa.charAt(index) <= 'F')) {
                countValue++;
            } else {
                System.out.printf("error: invalid hexadecimal string \"%s\"", hexa);
                break;
            }
        }
        if (countValue == hexa.length()) {
            int decimal = Integer.parseInt(hexa,16);
            System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is: %d", hexa, decimal);
        }
    }
}
