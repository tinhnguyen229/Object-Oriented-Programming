package oop_project.homework.hw4;

import java.math.BigInteger;
public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger big1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger big2 = new BigInteger("22222222222222222222222222222222222222222222222222");
        System.out.println(big1.add(big2));
        System.out.println(big1);
        System.out.println(big1.multiply(big2));
    }
}
