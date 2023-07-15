package oop_project.homework.hw3;

public class BookArray {
    private String name;
    private Author [] author;
    private double price;
    private int qty = 0;
    public BookArray(String name, Author [] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public BookArray(String name, Author [] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return this.name;
    }

    public Author [] getAuthor() {
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
        if (author == null) {
            return String.format("Book [name = %s,price = %.2f, quantity = %d]", this.name, this.price, this.qty);
        }
        String info = String.format("Book [name = %s, Author =", this.name);
        for (int i = 0; i < author.length; i++) {
            info += String.format("[name = %s, email = %s, gender = %c], ",author[i].getName(), author[i].getEmail(), author[i].getGender());
        }
        info += String.format("price = %.2f, quantity = %d]", this.price, this.qty);
        return info;
        // return String.format("Book [name = %s, Author = {[name = %s, email = %s, gender = %c], [name = %s, email = %s, gender = %c]}", 
        //                     this.name, author[0].getName(), author[0].getEmail(), author[0].getGender()
        //                     , author[1].getName(), author[1].getEmail(), author[1].getGender())
        //         + String.format(", price = %.2f, quantity = %d]", this.price, this.qty);
    }

    public String getAuthorName() {
        return author[0].getName() + ", " + author[1].getName();
    }

}
