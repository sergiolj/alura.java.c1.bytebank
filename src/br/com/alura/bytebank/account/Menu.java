package br.com.alura.bytebank.account;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Account account;

    public void mainMenu(Account account) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int operation = 0;

        while (!exit) {
            System.out.println("Operations");
            System.out.println("1. Check my Balance");
            System.out.println("2. Make a Deposit");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit\n");

            System.out.print("What would you like to do? ");
            operation = sc.nextInt();

            if (operation == 4) {
                exit = true;
            } else if (operation >= 1 && operation <= 3) {
                choose(operation, account);
            }else {
                System.out.println("Invalid option\n");
            }
        }
    }

    public void choose(int operation, Account account) {
        switch (operation) {
            case 1:
                System.out.println("\nAvailable for withdrawal: " + account.getBalance()+"\n");
                break;
            case 2:
                account.deposit(sc);
                break;
            case 3:
                account.withdrawal(sc);
                break;
            default:
                System.out.println("Invalid option\n");
                break;
        }
    }

}
