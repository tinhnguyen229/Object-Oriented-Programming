package oop_project.homework.hw4;

public class MyPolynomial {
    private double[] coeffs;
    public MyPolynomial(double ... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return this.coeffs.length - 1;
    }

    public double evaluate(double x) {
        double sum = 0;
        double mulX = 1;
        for (int i = 0; i < this.coeffs.length; i++) {
            mulX *= (i == 0 ? 1 : x);
            sum += mulX * this.coeffs[i];
        }
        return sum;
    }

    public MyPolynomial add(MyPolynomial right) {
        MyPolynomial res = this;
        if (res.getDegree() < right.getDegree()) {
            res = right;
            right = this;
        }

        double [] resCoeffs = res.coeffs;
        double [] rightCoeffs = right.coeffs;

        for (int i = 0; i < resCoeffs.length; i++) {
            if (i > rightCoeffs.length - 1) continue;
            resCoeffs[i] += rightCoeffs[i];
        }
        this.coeffs = res.coeffs;
        return this;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] res = new double[this.getDegree() + right.getDegree() + 1];
        double [] rightCoeffs = right.coeffs;

        for (int i = this.coeffs.length - 1; i >= 0; i--) {
            for (int j = rightCoeffs.length - 1; j >= 0; j--) {
                res[i + j] += this.coeffs[i] * rightCoeffs[j]; 
            }
        }
        this.coeffs = res;

        return this;
    }

    public String toString() {
        String string = "";
        for (int i = this.coeffs.length - 1; i > 0; i--) {
            string += String.format("%.1fx^%d + ", this.coeffs[i], i);
        }
        string += String.format("%.1f", this.coeffs[0]);
        return string;
    }
}
