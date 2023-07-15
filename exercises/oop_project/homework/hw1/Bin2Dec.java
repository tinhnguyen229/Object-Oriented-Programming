package oop_project.homework.hw1;
import java.util.Scanner;
public class Bin2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
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
            System.out.printf("The equivalent decimal number for binary \"%s\" is : %d", binary, decimal);
        }
    }
}
