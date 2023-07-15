package oop_project.homework.hw1;
import java.util.Scanner;
public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        while (true) {
            String radix = sc.nextLine();
            if (radix.equals("2") || radix.equals("8") || radix.equals("16")) {
                switch (radix) {
                    case "2":
                        System.out.print("Enter a string: ");
                        String binary = sc.nextLine();
                        int decimal = 0;
                        int count = 0;
                        for (int index = 0; index < binary.length(); index++) {
                            int valueBin;
                            if (binary.charAt(index) != '0' && binary.charAt(index) != '1') {
                                System.out.printf("error: invalid binary string \"%s\"", binary);
                                break;
                            } else if (binary.charAt(index) == '0') {
                                valueBin = 0;
                            } else {
                                valueBin = 1;
                            }
                            decimal = decimal * 2 + valueBin;
                            count++;
                        }
                        if (count == binary.length()) {
                            System.out.printf("The equivalent decimal number for \"%s\" is : %d", binary, decimal);
                        }
                        break;
                    
                    case "8":
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
                            int decNum = Integer.parseInt(octal,8);
                            System.out.printf("The equivalent decimal number for Octal \"%s\" is: %d", octal, decNum);
                        }
                        break;
        
                    case "16":
                        System.out.print("Enter a Hexadecimal string: ");
                        String hexa = sc.nextLine();
                        int countVal = 0;
                        for(int index = 0; index < hexa.length(); index++) {
                            if ((hexa.charAt(index) >= '0' && hexa.charAt(index) <= '9') || (hexa.charAt(index) >= 'a' && hexa.charAt(index) <= 'f') || (hexa.charAt(index) >= 'A' && hexa.charAt(index) <= 'F')) {
                                countVal++;
                            } else {
                                System.out.printf("error: invalid hexadecimal string \"%s\"", hexa);
                                break;
                            }
                        }
                        if (countVal == hexa.length()) {
                            int dec = Integer.parseInt(hexa,16);
                            System.out.printf("The equivalent decimal number for hexadecimal \"%s\" is: %d", hexa, dec);
                        }
                        break;
                }
                break;        
            } else {
                System.out.print("Enter again the radix: ");  
            }
        } 
    }
}
