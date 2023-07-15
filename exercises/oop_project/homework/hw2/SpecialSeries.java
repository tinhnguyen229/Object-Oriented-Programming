package oop_project.homework.hw2;
import java.util.Scanner;
public class SpecialSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(specialSeries(x, n));
    }

    public static double specialSeries(double x, int numTerms) {
        double sum = x;
        double mul = x;
        for (int i = 1; i <= 2 * numTerms + 1; i += 2) {
            mul *= (i / (i + 1)) * (i * (Math.pow(x, 2) / (i + 2)));
            sum += mul;
        }
        return sum;
    }
}
