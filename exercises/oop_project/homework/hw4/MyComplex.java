package oop_project.homework.hw4;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {

    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getReal() {
        return this.real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getImag() {
        return this.imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public boolean isReal() {
        if (this.imag == 0) return true;
        return false;
    }

    public boolean isImag() {
        if (this.real == 0) return true;
        return false;
    }

    public boolean equals(double real, double imag) {
        if (this.real == real && this.imag ==  imag) return true;
        return false;
    }

    public boolean equals(MyComplex another) {
        if (this.real == another.real && this.imag ==  another.imag) return true;
        return false;
    }

    public double magnitude() {
        return Math.round(Math.sqrt((this.real * this.real) + (this.imag * this.imag)) * 100.0) / 100.0;
    }

    public double argument() {
        return Math.atan2(this.imag, this.real);
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    public MyComplex multiply(MyComplex right) {
        double newReal = (this.real * right.real) - (this.imag * right.imag);
        double newImag = (this.real * right.imag) + (this.imag * right.real);
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        right = right.conjugate();
        MyComplex newComplex = this.multiply(right);
        this.real = newComplex.real / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));;
        this.imag = newComplex.imag / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));;
        return this;
    }

    public MyComplex conjugate() {
        this.imag = -this.imag;
        return this;
    }

    public String toString() {
        if (this.imag > 0 && this.real != 0) {
            return String.format("%.1f + %.1fi", this.real, this.imag);
        } else if (this.imag < 0 && this.real != 0) {
            return String.format("%.1f - %.1fi", this.real, Math.abs(this.imag));
        } else {
            if (this.real == 0 && this.imag == 0) {
                return String.format("%.1f", this.real);
            } else if (this.real == 0) {
                return String.format("%.1fi", this.imag);
            } else {
                return String.format("%.1f", this.real);
            }
            
        }
    }
}
