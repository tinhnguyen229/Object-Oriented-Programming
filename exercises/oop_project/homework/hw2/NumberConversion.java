package oop_project.homework.hw2;
import java.util.Scanner;
public class NumberConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String in = sc.nextLine().toUpperCase();
        System.out.print("Enter the input radix: ");
        int inRadix = sc.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = sc.nextInt();
        System.out.println(toRadix(in, inRadix, outRadix));
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        final String HEXADECIMAL = "0123456789ABCDEF"; 
        final String [] HEX_BITS = {"0000", "0001", "0010", "0011", 
                                    "0100", "0101", "0110", "0111",
                                    "1000", "1001", "1010", "1011",
                                    "1100", "1101", "1110", "1111"};
        String out = "";
        for (int i = 0; i < in.length(); i++) {
            int index = HEXADECIMAL.indexOf(in.charAt(i));
            out +=  HEX_BITS[index];
        }

        return "\"" + in + "\"" + " in radix " + inRadix + " is \"" + out + "\" in radix 2.";
    }
}
