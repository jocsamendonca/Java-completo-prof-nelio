import account.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account1;
        double deposit;

        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter account holder: ");
        String holder = sc.nextLine();



        System.out.println("Is there an initial deposit (y/n)? ");
        String isInitialDeposit = sc.nextLine();

        if (isInitialDeposit.equals("n")) {
            account1 = new Account(accountNumber, holder);
        } else {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account1 = new Account(accountNumber, holder, initialDeposit);
        }
        System.out.println(account1);

        System.out.println("Enter a deposit value: ");
        deposit = sc.nextDouble();
        account1.deposit(deposit);

        System.out.println(account1);

        System.out.println("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account1.withdraw(withdraw);

        System.out.println(account1);
    }
}