package com.learning.bankSimulator.test;

import com.learning.bankSimulator.enums.TransactionType;
import com.learning.bankSimulator.models.Bank;
import com.learning.bankSimulator.services.RandomOperationGenerator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@lombok.Setter
@lombok.NoArgsConstructor
public class TransactionGenerator {

    private Bank bank;
    ExecutorService executor;

    public TransactionGenerator(Bank bank, int numberOfThreads) {
        this.bank = bank;
        this.executor = Executors.newFixedThreadPool(numberOfThreads);
    }

    public void generateTransactions(int numberOfTransactions) {
        //To get a transaction type between DEPOSIT, WITHDRAW or TRANSFER
        RandomOperationGenerator randomOperationGenerator = new RandomOperationGenerator();
        TransactionType transactionTypeSelection;
        for (int i = 0; i < numberOfTransactions; i++) {
            //For every transaction cycle, get the actual transaction type to be performed
            transactionTypeSelection = randomOperationGenerator.getNewRandomTransactionType();

            if(transactionTypeSelection == TransactionType.DEPOSIT) {
                //TODO
            }

            if(transactionTypeSelection == TransactionType.WITHDRAW) {
                //TODO
            }

            if(transactionTypeSelection == TransactionType.TRANSFER) {
                //TODO
            }
        }
    }

    private boolean validateTransactions(){
        //TODO
        return false;
    }
}
