package br.com.alura.bytebank.account;

import java.util.Scanner;

public class Account {
    private double balance;
    private String holder;
    private String bank;
    private int branch;
    private int number;

    public double getBalance() {
        return balance;
    }

    public Account(String holder, String bank, int branch, int number) {
        this.balance = 0;
        this.holder = holder;
        this.bank = bank;
        this.branch = branch;
        this.number = number;
    }

    @Override
    public String toString() {
        String output;
        output = """
                *************************************
                Bank: %s \tBranch: %d \tNumber: %d
                Holder: %s
                
                Balance: %.2f
                *************************************
                """.formatted(this.bank, this.branch, this.number, this.holder, this.balance);
        return output;
    }

    public void deposit(Scanner sc) {
        System.out.print("Inform the deposit amount: ");
        double amount = sc.nextDouble();

        if(amount > 0) {
            this.balance += amount;
            System.out.println("Deposited $" + amount + ".");
            System.out.println("Your account balance is: $" + this.balance+"\n");
        }else{
            System.out.println("Invalid deposit amount.\n");
        }
    }

    public void withdrawal(Scanner sc) {
        System.out.print("Inform the withdrawal amount: ");
        double amount = sc.nextDouble();

        if(amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawn $" + amount + ".");
            System.out.println("Your account balance is: $" + this.balance+"\n");
        }else{
            System.out.println("Invalid withdrawal amount.\n");
        }
    }
}

