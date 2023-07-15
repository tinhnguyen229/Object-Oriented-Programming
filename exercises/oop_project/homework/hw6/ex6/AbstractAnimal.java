package oop_project.homework.hw6.ex6;

public abstract class AbstractAnimal {
    private  String name;

    public AbstractAnimal(String name) {
        this.name = name;
    }
    
    public abstract void greets();
}
