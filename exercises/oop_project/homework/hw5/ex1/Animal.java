package oop_project.homework.hw5.ex1;

public class Animal {
    private String name;

    public Animal() {

    }
    
    public Animal(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("Animal[name = %s]", this.name);
    }
}
