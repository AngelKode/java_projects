package com.learning.bankSimulator.services;

import com.learning.bankSimulator.enums.TransactionType;
import com.learning.bankSimulator.models.BankAccount;

public class TransactionService{

    public static void transferMoney(BankAccount originAccount, BankAccount destAccount, double amount) {

        System.out.println("---------------------------------------------------------------------------------------");
        if(originAccount == null || destAccount == null){
            System.out.println("Unable to transfer money because the bank account doesnt exist.");
            System.out.println("---------------------------------------------------------------------------------------");
            return;
        }

        System.out.println("Initiating transfer...");
        System.out.println("Validating account money available...");

        if(originAccount.getBalance() <= 0 || originAccount.getBalance() < amount){
            System.out.print("Unable to transfer money due to insufficient balance.");
            System.out.print("Reason: Amount to transfer: " + amount + " | Money available:" + originAccount);
            System.out.println("---------------------------------------------------------------------------------------");
            return;
        }

        System.out.print("Transferring " + amount + " to " + destAccount);

        try{
            //Subtract the amount to transfer from the origin account to the destination account
            originAccount.setBalance(originAccount.getBalance() - amount);

            //Deposit the amount to the destination account
            destAccount.deposit(amount);

            System.out.print("Successfully operation.\nNew Balance: Origin-" + originAccount + "New Balance: Dest-" + destAccount);
        }catch (InterruptedException ex){
            System.out.println("Error while transfer execution. " + ex.getMessage());
        }catch (Exception ex){
            System.out.println("Unable to execute transfer. " + ex.getMessage());
        }
        System.out.println("---------------------------------------------------------------------------------------");
    }

    public static void accountOperation(BankAccount originAccount, double amount, TransactionType type) throws InterruptedException {
        System.out.println("---------------------------------------------------------------------------------------");
        if(originAccount == null) {
            System.out.println("Account not found. Deposit transaction aborted");
            System.out.println("---------------------------------------------------------------------------------------");
            return;
        }

        System.out.print("Starting transaction to " + originAccount);
        if(type == TransactionType.DEPOSIT) {
            originAccount.deposit(amount);
        }else{
            originAccount.withdraw(amount);
        }

        System.out.print("Transaction completed\nNew Balance: " + originAccount);
        System.out.println("---------------------------------------------------------------------------------------");
    }

}
