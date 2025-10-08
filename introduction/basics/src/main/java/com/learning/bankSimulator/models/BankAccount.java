package com.learning.bankSimulator.models;

import com.learning.bankSimulator.interfaces.AccountOperation;

import java.util.concurrent.locks.ReentrantLock;

@lombok.Data
public class BankAccount implements AccountOperation {

    private double balance;
    private long accountNumber;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.accountNumber = 0;
    }

    @Override
    public synchronized void withdraw(double amount) {
        if(this.balance < amount) {
            System.out.println("Insufficient funds. Operation rejected :(");
            return;
        }
        System.out.print("Withdrawing " + amount + " from bank account " + accountNumber);
        this.balance -= amount;
        System.out.println(". New balance: " + this.balance);
    }

    @Override
    public synchronized void deposit(double amount) {
        if(amount < 0.0D){
            System.out.println("Unable to deposit negative values. Operation rejected :(");
            return;
        }
        System.out.println("Depositing " + amount + " to bank account " + accountNumber);
        this.balance += amount;
        System.out.println(". New balance: " + this.balance);
    }
}
