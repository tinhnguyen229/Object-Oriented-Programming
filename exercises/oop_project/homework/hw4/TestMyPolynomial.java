package oop_project.homework.hw4;

public class TestMyPolynomial {
    public static void main(String[] args) {
        double[] a = {1, 2, 3, 4, 5};
        MyPolynomial pol = new MyPolynomial(1, 1);
        MyPolynomial pol2 = new MyPolynomial(2, 1, 3);
        MyPolynomial pol3 = new MyPolynomial(a);
        System.out.println(pol);
        System.out.println(pol.evaluate(2));
        System.out.println(pol2);
        System.out.println(pol.multiply(pol2));
        System.out.println(pol);
        System.out.println(pol.evaluate(2));
        System.out.println(pol3);
    }
}
