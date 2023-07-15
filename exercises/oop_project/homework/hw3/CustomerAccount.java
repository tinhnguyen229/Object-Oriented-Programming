package oop_project.homework.hw3;

public class CustomerAccount {
    private int id;
    private String name;
    private char gender;

    public CustomerAccount() {

    }
    
    public CustomerAccount(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public char getGender() {
        return this.gender;
    }

    public String toString() {
        return String.format("%s(%d)", this.name, this.id);
    }
}
