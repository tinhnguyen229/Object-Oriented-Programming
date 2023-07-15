package oop_project.homework.hw3;

public class TestBookArray {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teek", "ahteck@nowhere.com", 'm');
        authors[1] = new Author("Paul Tan", "paul@nowhere.com", 'f');
        BookArray books = new BookArray("Java for dummy", authors, 19.99, 99);
        System.out.println(books);
    }
}
