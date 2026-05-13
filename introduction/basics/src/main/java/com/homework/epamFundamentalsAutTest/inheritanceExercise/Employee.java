package com.homework.epamFundamentalsAutTest.inheritanceExercise;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
public class Employee {
    private final String name;
    private final BigDecimal salary;
    @Setter
    private BigDecimal bonus;

    public Employee(String name, BigDecimal salary) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if(salary == null || salary.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.name = name;
        this.salary = salary;
    }

    public BigDecimal toPay() {
        return this.salary.add(this.bonus);
    }

}

