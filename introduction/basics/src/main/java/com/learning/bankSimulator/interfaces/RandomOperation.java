package com.learning.bankSimulator.interfaces;

import com.learning.bankSimulator.enums.TransactionType;

public interface RandomOperation {
    public TransactionType getNewRandomTransactionType();
}
