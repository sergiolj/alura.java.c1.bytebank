package br.com.alura.bytebank.model;
import java.util.Scanner;

public class SaldoCopia { public static void main(String[] args) {Scanner leitura = new Scanner(System.in);
    System.out.println("Digite o saldo:");
    var saldo = leitura.nextDouble();double p = saldo * (10.0 / 100);
    var valor = saldo + p;System.out.println("O saldo com o reajuste de 10% é: " + valor);}}