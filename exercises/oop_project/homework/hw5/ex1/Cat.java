package oop_project.homework.hw5.ex1;

public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    public String toString() {
        return String.format("Cat[%s]", super.toString());
    }
}
