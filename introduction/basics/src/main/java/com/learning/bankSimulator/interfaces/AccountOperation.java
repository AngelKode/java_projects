package com.learning.bankSimulator.interfaces;

public interface AccountOperation {
    public void withdraw(double amount) throws InterruptedException;
    public void deposit(double amount) throws InterruptedException;
}
