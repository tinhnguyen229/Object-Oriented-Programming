package oop_project.homework.hw1;
import java.util.Scanner;
public class Oct2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Octal string: ");
        String octal = sc.nextLine();
        int countValue = 0;
        for(int index = 0; index < octal.length(); index++) {
            if (octal.charAt(index) >= '0' && octal.charAt(index) <= '7') {
                countValue++;
            } else {
                System.out.printf("error: invalid Octal string \"%s\"", octal);
                break;
            }
        }
        if (countValue == octal.length()) {
            int decimal = Integer.parseInt(octal,8);
            System.out.printf("The equivalent decimal number for Octal \"%s\" is: %d", octal, decimal);
        }
    }
}
