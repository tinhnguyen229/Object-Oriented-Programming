package oop_project.homework.lab2;

import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        final String HEXADECIMAL = "0123456789abcdef"; 
        final String [] HEX_BITS = {"0000", "0001", "0010", "0011", 
                                    "0100", "0101", "0110", "0111",
                                    "1000", "1001", "1010", "1011",
                                    "1100", "1101", "1110", "1111"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hexa = sc.nextLine().toLowerCase();
        System.out.print("The equivalent binary for hexadecimal " + "\"" + hexa + "\" is: ");
        for (int i = 0; i < hexa.length(); i++) {
            int index = HEXADECIMAL.indexOf(hexa.charAt(i));
            System.out.print(HEX_BITS[index] + " ");
        }
    }
}
