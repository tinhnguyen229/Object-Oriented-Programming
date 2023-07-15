package oop_project.homework.hw3;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return this.qty;
    }

    public String toString() {
        return String.format("Book [name = %s, Author [name = %s, email = %s, gender = %c]", 
                            this.name, author.getName(), author.getEmail(), author.getGender())
                + String.format(", price = %.2f, quantity = %d]", this.price, this.qty);
    }
}
