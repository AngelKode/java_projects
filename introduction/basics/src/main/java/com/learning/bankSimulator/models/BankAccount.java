package com.learning.bankSimulator.models;

import com.learning.bankSimulator.interfaces.AccountOperation;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@lombok.Data
public class BankAccount implements AccountOperation {

    private static long ACCOUNT_COUNTER_ID = 1;
    private static final double ACCOUNT_MIN_FUNDS = 0.0D;
    private double balance;
    private long accountNumber;
    private ReentrantReadWriteLock accountLock;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.accountNumber = ACCOUNT_COUNTER_ID++;
        this.accountLock = new ReentrantReadWriteLock();
    }

    @Override
    public void withdraw(double amount) {
        if(this.balance < amount) {
            System.out.println("Insufficient funds to withdraw " + amount + ". Operation rejected :(");
            return;
        }

        //Lock the thread to operate the balance
        try {
            this.accountLock.writeLock().lock();
            System.out.println("Withdrawing " + amount + " from bank account " + accountNumber);
            Thread.sleep(3000);
            this.balance -= amount;
            System.out.println("New balance: " + this.balance);
        }catch(InterruptedException ex){
            System.out.println("Withdrawing went wrong." + ex.getMessage());
        }finally {
            //Unlock the thread
            this.accountLock.writeLock().unlock();
        }
    }

    @Override
    public void deposit(double amount){
        if(amount < BankAccount.ACCOUNT_MIN_FUNDS){
            System.out.println("Unable to deposit negative values. Operation rejected :(");
            return;
        }
        //Lock the thread to operate the account
        try{
            this.accountLock.writeLock().lock();
            System.out.println("Depositing " + amount + " to bank account " + accountNumber);
            Thread.sleep(3000);
            this.balance += amount;
            System.out.println("New balance: " + this.balance);
        }catch (InterruptedException ex){
            System.out.println("Depositing went wrong." + ex.getMessage());
        }finally {
            this.accountLock.writeLock().unlock();
        }
    }

    @Override
    public String toString() {
        //Lock read-lock when only reading data
        try{
            this.accountLock.readLock().lock();
            return "Bank Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
        }finally {
            this.accountLock.readLock().unlock();
        }
    }
}

