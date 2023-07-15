package oop_project.homework.hw3;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Tan Ah Teek", "ahteck@nowhere.com", 'm');
        System.out.println(author);
        author.setEmail("paulTan@nowhere.com");
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());
    }
}
