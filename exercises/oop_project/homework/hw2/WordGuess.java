package oop_project.homework.hw2;
import java.util.Scanner;
public class WordGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "testing";
        guess(word, sc);
    }

    public static void guess(String word, Scanner sc) {
        boolean [] position = new boolean[word.length()]; 
        int trialNum = 1;
        while (trialNum <= 5 ) {
            System.out.print("Key in one character or your guess word : ");
            String input = sc.nextLine();
            if (input.length() == 1) {

                if (word.contains(input)) {
                    System.out.printf("Trial %d: ", trialNum);
                    for (int i = 0; i < word.length(); i++) {
                        if (input.equals(Character.toString(word.charAt(i)))) {
                            position[i] = true;
                        }
                        if (position[i]) {
                            System.out.print(word.charAt(i));
                        } else {
                            System.out.print("_");
                        }
                    }
                } else {
                    System.out.printf("Not contain \'%s\' ", input);
                }

            } else {

                if (input.equals(word)) {
                    System.out.print("Congratulation !");
                    break;
                } else {
                    System.out.print("Incorrect !");
                }
                
            }
            System.out.println();
            trialNum++;
        }
    }
}
