package oop_project.homework.lab1;

import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Declare constants
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;
        final double SENTINEL = -1;

        // Declare variables
        System.out.print("Enter the monthly salary: $"); 
        int salary = sc.nextInt();
        while(salary != SENTINEL) {
            System.out.println("Enter age: ");
            int age = sc.nextInt();

            double employeeContribution, employerContribution, totalContribution ;
            
            if (age <= 55) {          // 55 trở xuống 
                employeeContribution = salary * EMPLOYEE_RATE_55_AND_BELOW;
                employerContribution = salary * EMPLOYER_RATE_55_AND_BELOW;
            } else if (age <= 60) {   
                employeeContribution = salary * EMPLOYEE_RATE_55_TO_60;
                employerContribution = salary * EMPLOYER_RATE_55_TO_60;
            }else if(age <= 65) {
                employeeContribution = salary * EMPLOYEE_RATE_60_TO_65;
                employerContribution = salary * EMPLOYER_RATE_60_TO_65;
            }else {
                employeeContribution = salary * EMPLOYEE_RATE_65_ABOVE;
                employerContribution = salary * EMPLOYER_RATE_65_ABOVE;
            }
            
            totalContribution = employeeContribution + employerContribution;
            

            System.out.printf("The employee's comtribution: $%.2f \n", employeeContribution);
            System.out.printf("The employer's comtribution: $%.2f \n", employerContribution);
            System.out.printf("The total contribution: $%.2f \n", totalContribution);
            System.out.print("Enter the monthly salary (or −1 to end): $"); 
            salary = sc.nextInt(); 
        }
        System.out.println("Bye!");   
}
}
