package oop_project.homework.lab6;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
    }

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        ;
        this.date = date;
    }

    public String getName() {
        return this.customer.getName();
    }

    public double getServiceExpense() {
        return this.serviceExpense;
    }

    public void setServiceExpense(double ex) {
        this.serviceExpense = ex;
    }

    public double getProductExpense() {
        return this.productExpense;
    }

    public void setProductExpense(double ex) {
        this.productExpense = ex;
    }

    public double getTotalExpense() {
        double serviceDiscount = this.serviceExpense
                - this.serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double productDiscount = this.productExpense
                - this.productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType());
        return serviceDiscount + productDiscount;
    }

    public String toString() {
        return String.format("%s | %s", customer.toString(), date.toString());
    }
}
