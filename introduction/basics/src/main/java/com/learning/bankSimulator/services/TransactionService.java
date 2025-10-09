package com.learning.bankSimulator.services;

import com.learning.bankSimulator.enums.TransactionType;
import com.learning.bankSimulator.models.BankAccount;

public class TransactionService{

    public static void transferMoney(BankAccount originAccount, BankAccount destAccount, double amount) {
        //TODO
    }

    public static void accountOperation(BankAccount originAccount, double amount, TransactionType type) {

        if(originAccount == null) {
            System.out.println("Account not found. Deposit transaction aborted");
            return;
        }

        System.out.println("Starting transaction to " + originAccount.getAccountNumber() + "...");
        if(type == TransactionType.DEPOSIT) {
            originAccount.deposit(amount);
        }else{
            originAccount.withdraw(amount);
        }

        System.out.println("Transaction completed");
    }

}
