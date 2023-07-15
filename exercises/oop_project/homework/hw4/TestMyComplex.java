package oop_project.homework.hw4;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex comp1 = new MyComplex(10, -5);
        MyComplex comp2 = new MyComplex(1, 1);
        MyComplex comp3 = new MyComplex();
        System.out.println(comp1);
        System.out.println(comp2);
        System.out.println(comp1.isReal());
        System.out.println(comp1.addNew(comp2).addNew(comp3));
        System.out.println(comp1);
        System.out.println(comp1.multiply(comp2).multiply(comp3));
        System.out.println(comp1);
    }
}
