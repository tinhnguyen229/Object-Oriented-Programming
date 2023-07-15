package oop_project.homework.hw3;

public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("A101", "Tan Ah Teek", 88);
        System.out.println(acc1);
        Account acc2 = new Account("A102", "Kumar");
        System.out.println(acc2);
        System.out.println("ID:" + acc1.getID());
        System.out.println("Name: " + acc1.getName());
        System.out.println("Balance: " + acc1.getBalance());

        acc1.credit(100);
        System.out.println(acc1);
        acc1.debit(50);
        System.out.println(acc1);
        acc1.debit(500);
        System.out.println(acc1);

        acc1.transferTo(acc2, 100);
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
