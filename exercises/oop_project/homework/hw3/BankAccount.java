package oop_project.homework.hw3;

public class BankAccount {
    private int id;
    private CustomerAccount customer;
    private double balance;

    public BankAccount() {
        this.customer = new CustomerAccount();
    }

    public BankAccount(int id, CustomerAccount customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    } 

    public BankAccount(int id, CustomerAccount customer) {
        this.id = id;
        this.customer = customer;
    } 

    public int getID() {
        return this.id;
    }

    public CustomerAccount getCustomer() {
        return this.customer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public String toString() {
        return String.format("%s(%d) balance = $%.2f", this.getCustomerName(), this.getID(), this.balance);
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public BankAccount deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public BankAccount withDraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}
