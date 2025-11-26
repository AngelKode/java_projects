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
        if(!TransactionType.TRANSFER.equals(transactionType)) {
            throw new InvalidParameterException("You can only TRANSFER when trying to operate a SHARED transaction");
        }

        BankAccount originBankAccount = this.bankAccounts.getOrDefault(originAccountID, null);
        BankAccount destBankAccount = this.bankAccounts.getOrDefault(destAccountID, null);

        //Validate if both accounts are not null
        if(originBankAccount == null && destBankAccount == null) {
            throw new Error("Unable to look up one or both accounts.");
        }

        TransactionService.transferMoney(originBankAccount, destBankAccount, amount);
    }
}
