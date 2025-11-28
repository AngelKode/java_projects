package com.learning.bankSimulator.services;

import com.learning.bankSimulator.enums.TransactionType;
import com.learning.bankSimulator.interfaces.RandomOperation;
import lombok.Data;

import java.util.Random;

@Data
public class RandomOperationGenerator implements RandomOperation {
    private final Random rand;

    public RandomOperationGenerator() {
        rand = new Random();
    }
    @Override
    public TransactionType getNewRandomTransactionType() {
        return TransactionType.values()[rand.nextInt(TransactionType.values().length)];
    }
}
