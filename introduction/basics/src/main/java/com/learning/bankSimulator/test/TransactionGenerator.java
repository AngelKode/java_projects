package com.learning.bankSimulator.test;

import com.learning.bankSimulator.models.Bank;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@lombok.Setter
@lombok.NoArgsConstructor
public class TransactionGenerator {

    private Bank bank;
    ExecutorService executor;

    public TransactionGenerator(Bank bank) {
        this.bank = bank;
        this.executor = Executors.newFixedThreadPool(10);
    }

    public void generateTransactions(int numberOfTransactions) {
        //TODO
        for (int i = 0; i < numberOfTransactions; i++) {

        }
    }

    private boolean validateTransactions(){
        //TODO
        return false;
    }
}
