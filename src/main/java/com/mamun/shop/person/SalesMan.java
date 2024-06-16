
package com.mamun.shop.person;

/**
 *
 * @author MAMUNUR ROSHID
 */
public class SalesMan extends User {
    private int baseSalary;
    private int balance;
    public SalesMan() {
        baseSalary = 0;
        balance = 0;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void addBalance(int num) {
        balance+=num;
    }
    public int getBalance() {
        return balance;
    }
}