package oop_project.homework.lab2;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimmal number: ");
        int decimal = sc.nextInt();
        String hexa = Integer.toHexString(decimal);
        System.out.println("The equivalent hexadecimal number is " + hexa.toUpperCase());

    }
}
