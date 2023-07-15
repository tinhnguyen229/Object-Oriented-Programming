package oop_project.src;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String choice = null;
        while (true) {
            Menu.showMenu();
            choice = sc.nextLine();
            switch (choice) {
                case "0": 
                    System.out.println("                     <-EXITED->                   ");
                    exit = true;
                    break;
                case "1":
                    RunFile.runHw1(args);
                    break;
                case "2":
                    RunFile.runHw2(args);
                    break;
                case "3":
                    RunFile.runHw3(args);
                    break;
                case "4":
                    RunFile.runHw4(args);
                    break;
                case "5":
                    RunFile.runHw5(args);
                    break;
                case "6":
                    RunFile.runHw6(args);
                    break;
                case "7":
                    RunFile.runLab1(args);
                    break;
                case "8":
                    RunFile.runLab2(args);
                    break;
                case "9":
                    RunFile.runLab6(args);
                    break;
                default:
                    System.out.println("                Invalid! Enter again.             ");
                    break;
            }
            if (exit) break;
        }
    }
}
