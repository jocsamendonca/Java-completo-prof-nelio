package model.entities;

import model.exceptions.AccountException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void deposit(double amount) {
        balance+= amount;
    }

    public void withdraw(double amount) {
        validateWithdraw(amount);
        balance-= amount;
    }

    private void validateWithdraw(double amount){
        if (amount > getWithdrawLimit()) {
            throw new AccountException("Withdraw error: The amount exceeds withdraw limit");
        }
        if(amount > getBalance()) {
            throw new AccountException("Withdraw error: Not enough balance");
        }
    }
}
