package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        double amount = sc.nextDouble();

        double result = CurrencyConverter.dollarToReal(dollarPrice, amount);

        System.out.printf("Amount to be paid in reais: %.2f%n", result);
    }
}
