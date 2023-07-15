package oop_project.homework.hw5.ex1;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog Dog");
        Dog dog1 = new Dog("Dog Dog Dog");
        System.out.println(dog);
        dog.greets();
        dog.greets(dog1);
    }
}
