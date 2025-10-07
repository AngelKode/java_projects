package com.learning.bankSimulator.interfaces;

import com.learning.bankSimulator.enums.TransactionType;

public interface BankOperation {
    public void startSimpleTransaction(TransactionType transactionType, double amount, String accountID);
    public void startSharedTransaction(TransactionType transactionType, double amount, String originAccountID, String destAccountID);
}
