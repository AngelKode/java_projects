package com.homework.epamFundamentalsAutTest.inheritanceExercise;

import java.math.BigDecimal;

public class Manager extends Employee{
    private final int clientAmount;

    public Manager(String name, BigDecimal salary, int clientAmount) {
        super(name, salary);
        if(clientAmount < 0){
            throw new IllegalArgumentException("Client amount cannot be negative");
        }
        this.clientAmount = clientAmount;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if(bonus.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Bonus cannot be negative");
        }
        super.setBonus(bonus);
        if(this.clientAmount > 100){
            super.setBonus(super.getBonus().add(new BigDecimal(500)));
        }

        if(this.clientAmount > 150){
            super.setBonus(super.getBonus().add(new BigDecimal(1500)));
        }
    }
}

