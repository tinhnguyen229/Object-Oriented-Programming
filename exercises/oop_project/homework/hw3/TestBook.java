package oop_project.homework.hw3;

public class TestBook {
    public static void main(String[] args) {
        Author author = new Author("Tan Ah Teek", "ahteck@nowhere.com", 'm');
        System.out.println(author);
        author.setEmail("paulTan@nowhere.com");
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());
        
        Book book = new Book("Java for dummy", author, 19.95, 99);
        System.out.println(book);
        book.setPrice(29.95);
        book.setQty(28);
        System.out.println("Name: " + book.getName());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Quantity: " + book.getQty());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Author's name: " + book.getAuthor().getName());
        System.out.println("Author's email: " + book.getAuthor().getEmail());
    }
}
