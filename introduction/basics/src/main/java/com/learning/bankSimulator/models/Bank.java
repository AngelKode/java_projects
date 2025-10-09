package com.learning.bankSimulator.models;

import com.learning.bankSimulator.enums.TransactionType;
import com.learning.bankSimulator.interfaces.BankOperation;
import com.learning.bankSimulator.services.TransactionService;

import java.security.InvalidParameterException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@lombok.Data
public class Bank implements BankOperation {
    private String bankName;
    private Map<String, BankAccount> bankAccounts;

    public Bank(String bankName) {
        this.bankAccounts = new ConcurrentHashMap<String, BankAccount>();
    }

    @Override
    public void startSimpleTransaction(TransactionType transactionType, double amount, String accountID) throws InterruptedException {
        if(TransactionType.TRANSFER.equals(transactionType)) {
            throw new InvalidParameterException("You cant TRANSFER with only one account");
        }
        BankAccount accountToOperate = this.bankAccounts.getOrDefault(accountID, null);
        TransactionService.accountOperation(accountToOperate, amount, transactionType);
    }

    @Override
    public void startSharedTransaction(TransactionType transactionType, double amount, String originAccountID, String destAccountID) {
        //TODO
    }
}
