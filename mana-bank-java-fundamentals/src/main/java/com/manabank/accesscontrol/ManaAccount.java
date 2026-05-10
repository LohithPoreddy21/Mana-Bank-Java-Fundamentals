package com.manabank.accesscontrol;
/*
TOPIC: Private access modifier

BANKING EXAMPLE: A bank account balance should not be changed from outside

JAVA RULE: Private members are accessible only inside the same class

COMPILE-TIME OR RUNTIME: Compile time rule. Java compiler stops illegal access before program runs

REAL-WORLD USE: Protects object state from uncontrolled changes
 */
public class ManaAccount {

    private String accountId;
    private double balance;

    public ManaAccount(String accountId, double openingBalance) {
        this.accountId = accountId;
        this.balance = openingBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public boolean hasEnoughBalance(double amount) {
        return balance >= amount;
    }

    public boolean canWithdraw(double amount) {
        return hasEnoughBalance(amount);
    }
}

