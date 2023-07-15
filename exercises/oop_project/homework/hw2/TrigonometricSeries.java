package oop_project.homework.hw2;
public class TrigonometricSeries {
    public static void main(String[] args) {        
        double x = Math.PI / 4;
        int n = 100;
    
        System.out.println(sin(x, n));
        System.out.println(cos(x, n));
        System.out.println();
        System.out.println(Math.sin(x));
        System.out.println(Math.cos(x));
    }

    public static double sin(double x, int numTerm) {
        double first = x;
        double sum = x;
        for (int i = 3; i <= 2 * numTerm + 1; i += 2) {
            first *= -(Math.pow(x, 2) / (i * (i - 1)));
            sum += first;
        }
        return sum;
    }

    public static double cos(double x, int numTerm) {
        double first = 1;
        double sum = 1;
        for (int i = 2; i <= 2 * numTerm; i += 2) {
            first *= -(Math.pow(x, 2) / (i * (i - 1)));
            sum += first;
        }
        return sum;
    }
}