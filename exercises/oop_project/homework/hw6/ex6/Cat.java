package oop_project.homework.hw6.ex6;

public class Cat extends AbstractAnimal {
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }
}
