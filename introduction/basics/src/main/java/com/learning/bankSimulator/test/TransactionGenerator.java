package com.learning.bankSimulator.test;

import com.learning.bankSimulator.models.Bank;

@lombok.Setter
@lombok.NoArgsConstructor
public class TransactionGenerator {

    private Bank bank;

    public TransactionGenerator(Bank bank) {
        this.bank = bank;
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
