package br.com.alura.bytebank.account;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void mainMenu(Account account) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int operation;
        String menu = """
                Operations
                1. Check my Balance
                2. Make a Deposit
                3. Withdraw Money
                4. Exit
                
                What would you like to do?
                """;

        while (!exit) {
            System.out.print(menu);
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
