package oop_project.homework.hw2;
import java.util.Scanner;
public class DateUtil {
    public static String [] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                                        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" } ;
    public static int [] daysInMonthsLeap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int [] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static String [] dayOfWeek = {"Sun", "Mon", "Tue", "Wen", "Thu", "Fri", "Sat"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        System.out.println(printDate(year, month, day));
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0  ) {
			return true;
        } 
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        // if ((year >= 1 && year <= 9999) && (month >= 1 && month <= 12) && (day >= 1 && day <= 31)) {
        //     if (isLeapYear(year)) {
        //         switch (month) {
        //             case 1:
        //             case 3:
        //             case 5:
        //             case 7:
        //             case 8:
        //             case 10:
        //             case 12:
        //                 if (day >= 1 && day <= 31) {
        //                     return true;
        //                 }
        //                 break;
        //             case 4:
        //             case 6:
        //             case 9:
        //             case 11:
        //                 if (day >= 1 && day <= 30) {
        //                     return true;
        //                 }
        //                 break;
        //             default:
        //                 if (day >= 1 && day <= 29) {
        //                     return true;
        //                 }
        //         }
        //     } else {
        //         switch (month) {
        //             case 1:
        //             case 3:
        //             case 5:
        //             case 7:
        //             case 8:
        //             case 10:
        //             case 12:
        //                 if (day >= 1 && day <= 31) {
        //                     return true;
        //                 }
        //                 break;
        //             case 4:
        //             case 6:
        //             case 9:
        //             case 11:
        //                 if (day >= 1 && day <= 30) {
        //                     return true;
        //                 }
        //                 break;
        //             default:
        //                 if (day >= 1 && day <= 28) {
        //                     return true;
        //                 }
        //         }
        //     }
        // }
        // return false;
        if ((year >= 1 && year <= 9999) && (month >= 1 && month <= 12) && (day >= 1 && day <= 31)) {
            if (isLeapYear(year)) {
                if (1 <= day && day <= daysInMonthsLeap[month - 1]) {
                    return true;
                }
                return false;
            } else {
                if (1 <= day && day <= daysInMonths[month - 1]) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        final int [] e = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4}; 
        if (month < 3) {
            year--;
        }
        return ((year + (year / 4) - (year / 100) + (year / 400) + e[month - 1] + day)) % 7;
    }

    public static String printDate(int year, int month, int day) {
        if (isValidDate(year, month, day) == false) return "Invalid!";
        String dayWeek = dayOfWeek[getDayOfWeek(year, month, day)];
        String mon = strMonths[month - 1];
        return dayWeek + " " + day + " " + mon + " " + year ;
    }

}
