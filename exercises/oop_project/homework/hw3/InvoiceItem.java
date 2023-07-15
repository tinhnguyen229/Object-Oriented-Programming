package oop_project.homework.hw3;

public class InvoiceItem {
    private String id;
    private String desc; //description
    private int qty; //quantity
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getID() {
        return this.id;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return this.qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public double getTotal() {
        return this.unitPrice * this.qty;
    }

    public String toString() {
        return "InvoiceItem [id = " + this.id + ", desc = " + this.desc 
                + ", qty = " + this.qty + ", unitPrice = " + this.unitPrice + "]";
    }

}
