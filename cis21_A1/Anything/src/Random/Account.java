package Random;

import java.util.Scanner;

public class Account {

    private int accNo;
    private String name;
    private int balance;

    public static void main(String[] args) {

        Account acc = new Account();

        Scanner sc = new Scanner(System.in);

        System.out.print("Set Account Number: ");
        acc.setAcc(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter your Account Name:");
        acc.setName(sc.nextLine());

        System.out.println("Enter deposit amount:");
        acc.deposit(sc.nextInt());

        System.out.print("Enter withdraw amount:");
        acc.withdraw(sc.nextInt());

        System.out.println("Account Number is:" + acc.getAcc());
        System.out.println("Account Name: " + acc.getName());
        System.out.println("Current Balance: " + acc.getBalance());
        System.out.println();

        sc.close();
    }

    public int getAcc() {
        return accNo;
    }

    public void setAcc(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int wtd) {
        if (wtd <= balance) {
            balance -= wtd;
        } else System.out.println("Insufficient Balance.");
    }
}