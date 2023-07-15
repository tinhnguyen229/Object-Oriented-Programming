package oop_project.homework.lab6;

public class TestEx1 {
    public static void main(String[] args) {
        Customer customer = new Customer("Nguyen Ngoc Tinh");
        customer.setMember(true);
        customer.setMemberType("Premium");
        System.out.println(customer);
        Date date = new Date(2021, 11, 26);
        Visit visitor = new Visit(customer, date);
        visitor.setProductExpense(1000);
        visitor.setServiceExpense(2000);
        System.out.println(visitor);
        System.out.println(visitor.getTotalExpense());

    }
}
