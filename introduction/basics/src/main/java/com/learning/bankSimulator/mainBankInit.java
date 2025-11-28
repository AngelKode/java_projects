package com.learning.bankSimulator;

import com.learning.bankSimulator.enums.TransactionType;
import com.learning.bankSimulator.models.Bank;
import com.learning.bankSimulator.models.BankAccount;
import com.learning.bankSimulator.services.TransactionService;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class mainBankInit {
    public static void main(String[] args) {
        //TODO
        ExecutorService es = Executors.newFixedThreadPool(2);

        BankAccount b1 = new BankAccount(1000);
        BankAccount b2 = new BankAccount(0);
        BankAccount b3 = new BankAccount(0);

        es.submit(() -> {
            try {
                TransactionService.accountOperation(b1, 200, TransactionType.DEPOSIT);
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        es.submit(() -> {
            try{
                TransactionService.transferMoney(b1, b3,200);
                Thread.sleep(5000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        });

        es.submit(() -> {
            try{
                TransactionService.transferMoney(b1, b2,200);
                Thread.sleep(5000);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        es.shutdown();
        while(!es.isTerminated()){
            try{
                System.out.println("Waiting for threads to finish");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
