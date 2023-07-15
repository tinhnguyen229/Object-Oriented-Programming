package oop_project.homework.lab1;

public class ComputePI {
    public static void main(String[] args) { 
        double sum = 0.0;
        int MAX_DENOMINATOR = 1000;
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += 1.0/denominator;
            } else if (denominator % 4 == 3) {
                sum -= 1.0/denominator;
            } else {
                System.out.println("Impossible!");
            }
        }
        System.out.println("PI = " + ( 4.0 * sum ));

        //the maximum number of terms (MAX TERM) as the terminating condition.
        int MAX_TERM = 10000;
        double sum1 = 0.0;
        for (int term = 1; term <= MAX_TERM; term++) {
            if (term % 2 == 1){
                sum1 += 1.0 / (term * 2 -1);
            } else {
                sum1 -= 1.0 / (term * 2 - 1);
            }
        }
        double PI = 4.0 * sum1;
        System.out.println("PI =  " + PI);

        //Compare PI anh Math.PI
        double compare = (PI / Math.PI) * 100;
        System.out.println("The values obtained and the Math.PI: " + compare + " %");
        
    }
}
