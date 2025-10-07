package com.learning.bankSimulator.interfaces;

import com.learning.bankSimulator.models.BankAccount;

public interface TransactionOperation {
    public void transferMoney(BankAccount originAccount, BankAccount destAccount, double amount);
    public void withdrawFromAccount(BankAccount originAccount, double amount);
    public void deposit(BankAccount originAccount, double amount);
}
