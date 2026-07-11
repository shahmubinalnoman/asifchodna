package Random;
import java.util.Scanner;

public class Account2 {
    private int accNo;
    private String title;
    private double balance;

    public static void main(String[] args) {
        Account2 acc = new Account2();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number:");
        acc.setAccNo(sc.nextInt());

        sc.nextLine();
        System.out.println("Enter Account Name:");
        acc.setTitle(sc.nextLine());

        System.out.println("Enter amount to deposit:");
        double depositAmount = sc.nextDouble();
        acc.deposit(depositAmount);

        System.out.println("Enter amount to withdraw:");
        double withdrawAmount = sc.nextDouble();
        acc.withdraw(withdrawAmount);

        System.out.println("\nAccount Number: " + acc.getAccNo());
        System.out.println("Title: " + acc.getTitle());
        System.out.println("Current Balance: " + acc.getBalance());

        sc.close();
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Not enough balance!");
        }
    }
}
