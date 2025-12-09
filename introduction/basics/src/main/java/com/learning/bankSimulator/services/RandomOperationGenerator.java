package com.learning.bankSimulator.services;

import com.learning.bankSimulator.enums.TransactionType;
import com.learning.bankSimulator.interfaces.RandomOperation;
import com.learning.bankSimulator.models.BankAccount;
import lombok.Data;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

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

    @Override
    public double getNewRandomAmount(double minRange, double maxRange) {
        //Return a number between min range and max range
        return minRange + rand.nextDouble() * (maxRange - minRange);
    }

    @Override
    public long getNewRandomAccount(ConcurrentHashMap<Long, BankAccount> accounts){
        //TODO: When getting the initial accounts, have the list of ids to avoid over computational operations
        return 1L;
    }
}
