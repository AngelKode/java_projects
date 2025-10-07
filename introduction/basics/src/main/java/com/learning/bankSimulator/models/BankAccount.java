package com.learning.bankSimulator.models;

import com.learning.bankSimulator.interfaces.AccountOperation;

import java.util.concurrent.locks.ReentrantLock;

@lombok.Data
public class BankAccount implements AccountOperation {

    private double balance;
    private long accountNumber;
    private ReentrantLock lock;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.accountNumber = 0;
        this.lock = new ReentrantLock();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing " + amount + " from bank account " + accountNumber);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Depositing " + amount + " from bank account " + accountNumber);
    }
}
