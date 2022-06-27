package oops;

import java.util.Scanner;

public class BankAccount {

    Person customer;
    Currency balance;
    int accountno;

    public BankAccount(Person customer, Currency balance, int accountno) {

        this.customer = customer;
        this.balance = balance;
        this.accountno = accountno;
    }

    public BankAccount() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Account detail");
        customer = new Person();
        balance = new Currency();
        System.out.println("Enter the Account number");
        accountno = Integer.parseInt(s.nextLine());

    }

    @Override
    public String toString() {
        return "BankAccount{" + "customer=" + customer + ", balance=" + balance + ", accountno=" + accountno + '}';
    }

    public static void main(String args[]) {
        BankAccount b = new BankAccount();
        System.out.println(b);
        Person p = new Person("Rahul", "rtgh", 667);
        System.out.println();
        BankAccount b1 = new BankAccount();
        System.out.println(b1);

    }

}
