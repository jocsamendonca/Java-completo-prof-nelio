package account;

public class Account {
    private static final double TAX = 5.00;
    private final int number;
    private String holder;
    private double balance;


    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {

        if (amount < this.balance) {
            this.balance -= (amount + TAX);
        } else {
            System.out.println("Withdraw amount is bigger then your balance!");
        }

    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account data: " +
                "Account: " + number +
                ", holder: " + holder +
                ", balance: " + balance;
    }
}
