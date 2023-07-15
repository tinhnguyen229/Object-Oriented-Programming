package oop_project.homework.hw1;
import java.util.Scanner;
public class TestPalindromicPhrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String forwardPhrase = sc.nextLine();
        String forwardSolve = ""; // to eliminate some chars as ! , . ' v.v...
        String backwardPhrase = "";

        // get forSolve
        for(int index = 0; index < forwardPhrase.length(); index++) {
            if (forwardPhrase.charAt(index) >= 'a' && forwardPhrase.charAt(index) <= 'z' 
                || forwardPhrase.charAt(index) >= 'A' && forwardPhrase.charAt(index) <= 'Z') {
                forwardSolve += forwardPhrase.charAt(index);
            }
        }

        //get backwardPhrase
        for(int index = forwardSolve.length() - 1; index >= 0; index--) {
            if (forwardSolve.charAt(index) >= 'a' && forwardSolve.charAt(index) <= 'z' 
                || forwardSolve.charAt(index) >= 'A' && forwardSolve.charAt(index) <= 'Z') {
                backwardPhrase += forwardSolve.charAt(index);
            }
        }

        if(backwardPhrase.toLowerCase().equals(forwardSolve.toLowerCase())) {
            System.out.printf("\"%s\" is palindromic phrase !", forwardPhrase);
        } else {
            System.out.printf("\"%s\" isn't palindromic phrase !", forwardPhrase);
        }
    }
}
