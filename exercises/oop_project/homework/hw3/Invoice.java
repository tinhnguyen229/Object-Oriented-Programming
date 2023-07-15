package oop_project.homework.hw3;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return this.id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return this.customer;
    } 

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public int getCustomerID() {
        return this.customer.getID();
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public int getCustomerDiscount() {
        return this.customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        this.amount = Math.round((this.amount - (this.amount * this.customer.getDiscount() / 100.0)) * 100.0) / 100.0;
        return this.amount;
    }

    public String toString() {
        return String.format("Invoice [ID = %d, Customer = %s(%d)(%d%%), amount = %.2f]"
                            , this.id, this.getCustomerName(), this.getCustomerID()
                            , this.getCustomerDiscount(), this.amount);
    }
}
