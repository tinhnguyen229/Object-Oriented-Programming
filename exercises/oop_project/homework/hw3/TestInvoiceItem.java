package oop_project.homework.hw3;

public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem invoice = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(invoice);
        invoice.setQty(999);
        invoice.setUnitPrice(0.99);
        System.out.println(invoice);
        System.out.println("ID: " + invoice.getID());
        System.out.println("Desc: " + invoice.getDesc());
        System.out.println("Qty: " + invoice.getQty());
        System.out.println("Unit price: " + invoice.getUnitPrice());
        System.out.println("The total: " + invoice.getTotal());
    }
}
