package com.homework.epamFundamentalsAutTest.inheritanceExercise;

import java.math.BigDecimal;

public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        if(employees==null){
            throw new IllegalArgumentException("Employees list cannot be null");
        }
        this.employees = employees;
    }

    public void giveEverybodyBonus(BigDecimal companyBonus){
        for(Employee employee : employees) {
            employee.setBonus(companyBonus);
        }
    }

    public BigDecimal totalToPay() {
        BigDecimal total = BigDecimal.ZERO;
        for(Employee employee : employees) {
            System.out.println("Bonus: " + employee.getBonus());
            System.out.println("Total: " + employee.toPay());
            total = total.add(employee.toPay());
        }
        return total;
    }

    public String nameMaxSalary() {
        Employee maxSalaryEmployee = this.employees[0];
        for(Employee employee : employees) {
            if(employee.toPay().compareTo(maxSalaryEmployee.toPay()) > 0) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee.getName();
    }
}

