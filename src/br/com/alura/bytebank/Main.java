package br.com.alura.bytebank;

import br.com.alura.bytebank.account.Account;
import br.com.alura.bytebank.account.Menu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao ByteBank" );
        Menu menu = new Menu();

        Account account = new Account("Peter Parker","CityBank",1,1);
        System.out.println(account.toString());

        menu.mainMenu(account);
    }
}
