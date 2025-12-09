package com.learning.bankSimulator.interfaces;

import com.learning.bankSimulator.enums.TransactionType;
import com.learning.bankSimulator.models.BankAccount;

import java.util.concurrent.ConcurrentHashMap;

public interface RandomOperation {
    public TransactionType getNewRandomTransactionType();
    public double getNewRandomAmount(double minRange, double maxRange);
    public long getNewRandomAccount(ConcurrentHashMap<Long, BankAccount> accounts);
}
