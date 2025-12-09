package com.learning.bankSimulator.interfaces;

import com.learning.bankSimulator.enums.TransactionType;

public interface RandomOperation {
    public TransactionType getNewRandomTransactionType();
    public double getNewRandomAmount(double minRange, double maxRange);
}
