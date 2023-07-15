package oop_project.homework.hw3;

public class TestCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer(88, "Tan Ah Teek", 10);
        System.out.println(customer);
        customer.setDiscount(8);
        System.out.println("ID: " + customer.getID());
        System.out.println("Name: " + customer.getName());
        System.out.println("Discount: " + customer.getDiscount());
    }
}
