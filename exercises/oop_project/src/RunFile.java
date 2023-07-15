package oop_project.src;

import java.util.Scanner;
import oop_project.homework.hw1.*;
import oop_project.homework.hw2.*;
import oop_project.homework.hw3.*;
import oop_project.homework.hw4.*;
import oop_project.homework.hw5.*;
import oop_project.homework.hw6.*;
import oop_project.homework.lab1.*;
import oop_project.homework.lab2.*;
import oop_project.homework.lab6.*;

public class RunFile {
    public static void runHw1(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String choose = null;
        while (true) {
            System.out.println();
            Menu.showMenuHw1();
            choose = sc.nextLine();
            switch (choose) {
                case "0":
                    System.out.println("              < EXITED HOMEWORK 1 >              ");
                    exit = true;
                    break;
                case "1":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                  Bin2Dec                      |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.Bin2Dec.main(args);
                    break;
                case "2":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                  BoxPattern                   |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.BoxPattern.main(args);
                    break;
                case "3":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                  CaesarCode                   |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.CaesarCode.main(args);
                    break;
                case "4":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                CheckerPattern                 |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.CheckerPattern.main(args);
                    break;
                case "5":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|              CountVowelsDigits                |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.CountVowelsDigits.main(args);
                    break;
                case "6":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|              DecipherCaesarCode               |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.DecipherCaesarCode.main(args);
                    break;
                case "7":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                ExchangeCipher                 |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.ExchangeCipher.main(args);
                    break;
                case "8":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Factorial                   |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.Factorial.main(args);
                    break;
                case "9":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Hex2Dec                     |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.Hex2Dec.main(args);
                    break;
                case "10":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 HillPattern                   |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.HillPattern.main(args);
                    break;
                case "11":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Oct2Dec                     |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.Oct2Dec.main(args);
                    break;
                case "12":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 PhoneKeyPad                   |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.PhoneKeyPad.main(args);
                    break;
                case "13":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 RadixN2Dec                    |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.RadixN2Dec.main(args);
                    break;
                case "14":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 ReverseString                 |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.ReverseString.main(args);
                    break;
                case "15":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 SquarePattern                 |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.SquarePattern.main(args);
                    break;
                case "16":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|             TestPalindromePhrase               |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.TestPalindromicPhrase.main(args);
                    break;
                case "17":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|             TestPalindromeWords               |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.TestPalindromicWord.main(args);
                    break;
                case "18":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 TimeTable                     |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.TimeTable.main(args);
                    break;
                case "19":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|               TriangularPattern               |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.TriangularPattern.main(args);
                    break;
                case "20":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 CheckHexStr                   |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw1.CheckHexStr.main(args);
                    break;
                default:
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 FILE NOT EXIST !              |");
                    System.out.println("-------------------------------------------------");
                    break;
            }
            if (exit)
                break;
        }
    }

    public static void runHw2(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String choose = null;
        while (true) {
            System.out.println();
            Menu.showMenuHw2();
            choose = sc.nextLine();
            switch (choose) {
                case "0":
                    System.out.println("              < EXITED HOMEWORK 2 >              ");
                    exit = true;
                    break;
                case "1":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Matrix                      |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.Matrix.main(args);
                    break;
                case "2":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|             TrigonometricSeries               |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.TrigonometricSeries.main(args);
                    break;
                case "3":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|               ExponentialSeries               |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.SpecialSeries.main(args);
                    break;
                case "4":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   FactorialInt                |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.FactorialInt.main(args);
                    break;
                case "5":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   FibonacciInt                |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.FibonacciInt.main(args);
                    break;
                case "6":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 NumberConversion              |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.NumberConversion.main(args);
                    break;
                case "7":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   NumberGuess                 |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.NumberGuess.main(args);
                    break;
                case "8":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   WordGuess                   |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.WordGuess.main(args);
                    break;
                case "9":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   DateUtil                    |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.DateUtil.main(args);
                    break;
                case "10":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|               FactorialRecursive              |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.FactorialRecursive.main(args);
                    break;
                case "11":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|               FibonacciRecursive              |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.FibonacciRecursive.main(args);
                    break;
                case "12":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   LengthNumber                |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.LengthNumber.main(args);
                    break;
                case "13":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 GCDRecursive                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.GCDRecursive.main(args);
                    break;
                case "14":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 LinearSearch                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.LinearSearch.main(args);
                    break;
                case "15":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|            BinarySearchRecursive              |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.BinarySearchRecursive.main(args);
                    break;
                case "16":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   BubbleSort                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.BubbleSort.main(args);
                    break;
                case "17":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 SelectionSort                 |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.SelectionSort.main(args);
                    break;
                case "18":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 InsertionSort                 |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.InsertionSort.main(args);
                    break;
                case "19":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                  PerfectNumberList            |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.PerfectNumberList.main(args);
                    break;
                case "20":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   PrimeList                   |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.PrimeList.main(args);
                    break;
                case "21":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|             PerfectPrimeFactorList            |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.PerfectPrimeFactorList.main(args);
                    break;
                case "22":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                     GCD                       |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw2.GCD.main(args);
                    break;
                default:
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 FILE NOT EXIST !              |");
                    System.out.println("-------------------------------------------------");
                    break;
            }
            if (exit)
                break;
        }
    }

    public static void runHw3(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String choose = null;
        while (true) {
            System.out.println();
            Menu.showMenuHw3();
            choose = sc.nextLine();
            switch (choose) {
                case "0":
                    System.out.println("              < EXITED HOMEWORK 3 >              ");
                    exit = true;
                    break;
                case "1":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Account                     |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestAccount.main(args);
                    break;
                case "2":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                     Ball                      |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestBall.main(args);
                    break;
                case "3":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Cirlce                      |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestCircle.main(args);
                    break;
                case "4":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                     Date                      |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestDate.main(args);
                    break;
                case "5":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Employee                    |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestEmployee.main(args);
                    break;
                case "6":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                  InvoiceItem                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestInvoiceItem.main(args);
                    break;
                case "7":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Rectangle                   |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestRectangle.main(args);
                    break;
                case "8":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                     Time                      |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestTime.main(args);
                    break;
                case "9":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                  BankAccount                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestBankAccount.main(args);
                    break;
                case "10":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Author                      |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestAuthor.main(args);
                    break;
                case "11":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                     Book                      |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestBook.main(args);
                    break;
                case "12":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                  BookArray                    |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestBookArray.main(args);
                    break;
                case "13":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Customer                    |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestCustomer.main(args);
                    break;
                case "14":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 CustomerAccount               |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestCustomerAccount.main(args);
                    break;
                case "15":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Invoice                     |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestInvoice.main(args);
                    break;
                case "16":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   MyCircle                    |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestMyCircle.main(args);
                    break;
                case "17":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   MyLine                      |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestMyLine.main(args);
                    break;
                case "18":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   MyPoint                      |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestMyPoint.main(args);
                    break;
                case "19":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                  MyRectangle                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestMyRectangle.main(args);
                    break;
                case "20":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   MyTriangle                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw3.TestMyTriangle.main(args);
                    break;
                default:
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 FILE NOT EXIST !              |");
                    System.out.println("-------------------------------------------------");
                    break;
            }
            if (exit)
                break;
        }
    }

    public static void runHw4(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String choose = null;
        while (true) {
            System.out.println();
            Menu.showMenuHw4();
            choose = sc.nextLine();
            switch (choose) {
                case "0":
                    System.out.println("              < EXITED HOMEWORK 4 >              ");
                    exit = true;
                    break;
                case "1":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                     Ball                      |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw4.TestBall.main(args);
                    break;
                case "2":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                  BallPlaying                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw4.TestBallPlaying.main(args);
                    break;
                case "3":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                  Container                    |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw4.TestContainer.main(args);
                    break;
                case "4":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   MyComplex                   |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw4.TestMyComplex.main(args);
                    break;
                case "5":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   MyDate                      |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw4.TestMyDate.main(args);
                    break;
                case "6":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 MyPolynomial                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw4.TestMyPolynomial.main(args);
                    break;
                case "7":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   MyTime                      |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw4.TestMyTime.main(args);
                    break;
                case "8":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   BigInteger                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw4.TestBigInteger.main(args);
                    break;
                case "9":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Player                      |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw4.TestPlayer.main(args);
                    break;
                default:
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 FILE NOT EXIST !              |");
                    System.out.println("-------------------------------------------------");
                    break;
            }
            if (exit)
                break;
        }
    }

    public static void runHw5(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String choose = null;
        while (true) {
            Menu.showMenuHw5();
            choose = sc.nextLine();
            switch (choose) {
                case "0":
                    System.out.println("              < EXITED HOMEWORK 5 >              ");
                    exit = true;
                    break;
                case "1":
                    runHw5_Ex1(args);
                    break;
                case "2":
                    runHw5_Ex2(args);
                    break;
                default:
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 FILE NOT EXIST !              |");
                    System.out.println("-------------------------------------------------");
                    break;
            }
            if (exit)
                break;
        }
    }

    public static void runHw5_Ex1(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String choose = null;
        while (true) {
            Menu.showMenuHw5_Ex1();
            choose = sc.nextLine();
            switch (choose) {
                case "0":
                    System.out.println("            < EXITED HOMEWORK 5 Ex1 >            ");
                    exit = true;
                    break;
                case "1":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                  TestCylinder                 |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw5.ex1.TestCylinder.main(args);
                    break;
                case "2":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   TestPerson                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw5.ex1.TestPerson.main(args);
                    break;
                case "3":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   3DPoint                     |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw5.ex1.TestPoint3D.main(args);
                    break;
                case "4":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   TestShape                   |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw5.ex1.TestShape.main(args);
                    break;
                case "5":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   TestCircle                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw5.ex1.TestCircle.main(args);
                    break;
                case "6":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                  TestRectangle                |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw5.ex1.TestRectangle.main(args);
                    break;
                case "7":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   TestSquare                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw5.ex1.TestSquare.main(args);
                    break;
                case "8":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   TestAnimal                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw5.ex1.TestAnimal.main(args);
                    break;
                case "9":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   TestMammal                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw5.ex1.TestMammal.main(args);
                    break;
                case "10":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   TestCat                     |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw5.ex1.TestCat.main(args);
                    break;
                case "11":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   TestDog                     |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw5.ex1.TestDog.main(args);
                    break;
                default:
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 FILE NOT EXIST !              |");
                    System.out.println("-------------------------------------------------");
                    break;
            }
            if (exit)
                break;
        }
    }

    public static void runHw5_Ex2(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String choose = sc.nextLine();
        while (true) {
            Menu.showMenuHw5_Ex2();
            choose = sc.nextLine();
            switch (choose) {
                case "0":
                    System.out.println("            < EXITED HOMEWORK 5 Ex2 >            ");
                    exit = true;
                    break;
                case "1":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   TestPoint                   |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw5.ex2.TestPoint.main(args);
                    break;
                case "2":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   TestLine                    |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw5.ex2.TestLine.main(args);
                    break;
                case "3":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                  TestLineSub                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw5.ex2.TestLineSub.main(args);
                    break;
                case "4":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                  TestCylinder                 |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw5.ex2.TestCylinder.main(args);
                    break;
                default:
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 FILE NOT EXIST !              |");
                    System.out.println("-------------------------------------------------");
                    break;
            }
            if (exit)
                break;
        }
    }

    public static void runHw6(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String choose = sc.nextLine();
        while (true) {
            Menu.showMenuHw6();
            choose = sc.nextLine();
            switch (choose) {
                case "0":
                    System.out.println("              < EXITED HOMEWORK 6 >              ");
                    exit = true;
                    break;
                case "1":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 AbstractShape                 |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw6.ex1.Test.main(args);
                    break;
                case "2":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 GeometricObject               |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw6.ex2.Test.main(args);
                    break;
                case "3":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 MovablePoint                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw6.ex3.Test.main(args);
                    break;
                case "4":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                MovalbeCircle                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw6.ex4.Test.main(args);
                    break;
                case "5":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Resizable                   |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw6.ex5.Test.main(args);
                    break;
                case "6":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                AbstractAnimal                 |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw6.ex6.Test.main(args);
                    break;
                case "7":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                MovableRectangle               |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.hw6.ex8.Test.main(args);
                    break;
                default:
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 FILE NOT EXIST !              |");
                    System.out.println("-------------------------------------------------");
                    break;
            }
            if (exit)
                break;
        }
    }

    public static void runLab1(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String choose = null;
        while (true) {
            System.out.println();
            Menu.showMenuLab1();
            choose = sc.nextLine();
            switch (choose) {
                case "0":
                    System.out.println("                 < EXITED LAB 1 >                ");
                    exit = true;
                    break;
                case "1":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|           AverageWithInputValidation          |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.AverageWithInputValidation.main(args);
                    break;
                case "2":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 CheckOddEven                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.CheckOddEven.main(args);
                    break;
                case "3":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                CheckPassFail                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.CheckPassFail.main(args);
                    break;
                case "4":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|               CircleComputation               |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.CircleComputation.main(args);
                    break;
                case "5":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   CountNumber                 |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.CountNumber.main(args);
                    break;
                case "6":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   ComputePI                   |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.ComputePI.main(args);
                    break;
                case "7":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 ExtractDigits                 |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.ExtractDigits.main(args);
                    break;
                case "8":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Fibonacci                   |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.Fibonacci.main(args);
                    break;
                case "9":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 HarmonicSum                   |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.HarmonicSum.main(args);
                    break;
                case "10":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                InputValidation                |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.InputValidation.main(args);
                    break;
                case "11":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|    PensionContributionCalculatorWithSentinel  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.PensionContributionCalculatorWithSentinel.main(args);
                    break;
                case "12":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|        PensionContributionCalculator          |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.PensionContributionCalculator.main(args);
                    break;
                case "13":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|               PrintDayInWorld                 |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.PrintDayInWorld.main(args);
                    break;
                case "14":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|               PrintNumberInWord               |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.PrintNumberInWord.main(args);
                    break;
                case "15":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                  ReverseInt                   |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.ReverseInt.main(args);
                    break;
                case "16":
                    System.out.println("---SumAverageRunningInt---");
                    System.out.println("-------------------------------------------------");
                    System.out.println("|              SumAverageRunningInt             |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.SumAverageRunningInt.main(args);
                    break;
                case "17":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   SumOddEven                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.SumOddEven.main(args);
                    break;
                case "18":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                  SumOfSquares                 |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.SumOfSquares.main(args);
                    break;
                case "19":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                SumProductMinMax3              |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.SumProductMinMax3.main(args);
                    break;
                case "20":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|               SumProductMinMax5               |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab1.SumProductMinMax5.main(args);
                    break;
                default:
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 FILE NOT EXIST !              |");
                    System.out.println("-------------------------------------------------");
                    break;
            }
            if (exit)
                break;
        }
    }

    public static void runLab2(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String choose = null;
        while (true) {
            System.out.println();
            Menu.showMenuLab2();
            choose = sc.nextLine();
            switch (choose) {
                case "0":
                    System.out.println("                 < EXITED LAB 2 >                ");
                    exit = true;
                    break;
                case "1":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Array2String                |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab2.Array2String.main(args);
                    break;
                case "2":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Contains                    |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab2.Contains.main(args);
                    break;
                case "3":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   CopyArray                   |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab2.Copy.main(args);
                    break;
                case "4":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Dec2Hex                     |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab2.Dec2Hex.main(args);
                    break;
                case "5":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Equals                      |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab2.Equals.main(args);
                    break;
                case "6":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Exponent                    |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab2.Exponent.main(args);
                    break;
                case "7":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                  GradeHistogram               |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab2.GradeHistogram.main(args);
                    break;
                case "8":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|               GradesStatistics                |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab2.GradesStatistics.main(args);
                    break;
                case "9":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 GradeStatistic                |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab2.GradeStatistic.main(args);
                    break;
                case "10":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Hex2Bin                     |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab2.Hex2Bin.main(args);
                    break;
                case "11":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   MagicSum                    |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab2.MagicSum.main(args);
                    break;
                case "12":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                     Print                     |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab2.Print.main(args);
                    break;
                case "13":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   PrintArray                  |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab2.PrintArray.main(args);
                    break;
                case "14":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|               PrintArrayInStars               |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab2.PrintArrayInStars.main(args);
                    break;
                case "15":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                   Reverse                     |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab2.Reverse.main(args);
                    break;
                case "16":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                     Search                    |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab2.Search.main(args);
                    break;
                case "17":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                      Swap                     |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab2.Swap.main(args);
                    break;
                default:
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 FILE NOT EXIST !              |");
                    System.out.println("-------------------------------------------------");
                    break;
            }
            if (exit)
                break;
        }
    }

    public static void runLab6(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String choose = null;
        while (true) {
            Menu.showMenuLab6();
            choose = sc.nextLine();
            switch (choose) {
                case "0":
                    System.out.println("                 < EXITED LAB 6 >                ");
                    exit = true;
                    break;
                case "1":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 Customer_Visit                |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab6.TestEx1.main(args);
                    break;
                case "2":
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 PolyLine_Point                |");
                    System.out.println("-------------------------------------------------");
                    oop_project.homework.lab6.TestEx2.main(args);
                    break;
                default:
                    System.out.println("-------------------------------------------------");
                    System.out.println("|                 FILE NOT EXIST !              |");
                    System.out.println("-------------------------------------------------");
                    break;
            }
            if (exit) break;
        }
    }
}
