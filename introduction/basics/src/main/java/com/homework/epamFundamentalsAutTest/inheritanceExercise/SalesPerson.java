package com.homework.epamFundamentalsAutTest.inheritanceExercise;

import java.math.BigDecimal;

public class SalesPerson extends Employee{
    private final int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        if(percent < 0) {
            throw new IllegalArgumentException("Invalid percentage");
        }
        this.percent = percent;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if(bonus.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Bonus cannot be negative");
        }
        super.setBonus(bonus);
        BigDecimal newBonus = BigDecimal.ZERO;
        if(percent >= 100){
            newBonus = super.getBonus().multiply(new BigDecimal(2));
            super.setBonus(newBonus);
        }
        if(percent >= 200){
            newBonus = super.getBonus().multiply(new BigDecimal(3));
            super.setBonus(newBonus);
        }
    }
}

