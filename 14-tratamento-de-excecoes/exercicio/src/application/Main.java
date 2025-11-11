package application;

import model.entities.Account;
import model.exceptions.AccountException;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, initialBalance, withdrawLimit);
        System.out.println();

        System.out.print("Enter amount for withdraw: ");
        double withdrawAmount = sc.nextDouble();

        try {
            acc.withdraw(withdrawAmount);
            System.out.printf("New balance: %.2f", acc.getBalance());
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}