package oop_project.homework.lab1;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("The number is: " + number);

        if(number % 2 == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }

        System.out.println("Bye!");
    }
    

}
