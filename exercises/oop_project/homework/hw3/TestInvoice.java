package oop_project.homework.hw3;

public class TestInvoice {
    public static void main(String[] args) {
        Customer customer = new Customer(88, "Tan Ah Teek", 10);
        System.out.println(customer);
        customer.setDiscount(8);
        System.out.println("ID: " + customer.getID());
        System.out.println("Name: " + customer.getName());
        System.out.println("Discount: " + customer.getDiscount());

        Invoice invoice = new Invoice(101, customer, 888.8);
        System.out.println(invoice);
        invoice.setAmount(999.9);
        System.out.println(invoice);
        System.out.println("ID: " + invoice.getID());
        System.out.println("Customer: " + invoice.getCustomer());
        System.out.println("Amount: : " + invoice.getAmount());
        System.out.println("Customer's ID: " + invoice.getCustomerID());
        System.out.println("Customer's name: " + invoice.getCustomerName());
        System.out.println("Customer's discount: " + invoice.getCustomerDiscount());
        System.out.println("Amount after discount: " + invoice.getAmountAfterDiscount());
    }
}
