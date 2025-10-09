package com.learning.bankSimulator.interfaces;

public interface AccountOperation {
    public void withdraw(double amount);
    public void deposit(double amount) throws InterruptedException;
}
