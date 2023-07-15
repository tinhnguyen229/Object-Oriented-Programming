package oop_project.homework.hw3;

public class TestBankAccount {
    public static void main(String[] args) {
        CustomerAccount customer = new CustomerAccount(22, "Tinh", 'm');
        System.out.println(customer);

        BankAccount account = new BankAccount(customer.getID(), customer, 999.9);
        System.out.println(account);
        account.setBalance(1111);
        account.deposit(1111);
        System.out.println(account);
        account.withDraw(2222);
        System.out.println(account);
    }
}
