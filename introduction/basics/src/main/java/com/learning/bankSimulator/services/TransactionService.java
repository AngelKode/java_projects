package com.learning.bankSimulator.services;

import com.learning.bankSimulator.interfaces.TransactionOperation;
import com.learning.bankSimulator.models.BankAccount;

public class TransactionService implements TransactionOperation, Runnable{


    @Override
    public void transferMoney(BankAccount originAccount, BankAccount destAccount, double amount) {
        //TODO
    }

    @Override
    public void withdrawFromAccount(BankAccount originAccount, double amount) {
        //TODO
    }

    @Override
    public void deposit(BankAccount originAccount, double amount) {
        //TODO
    }

    @Override
    public void run() {

    }
}
