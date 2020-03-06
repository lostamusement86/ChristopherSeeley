/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christopherseeley;

import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 *
 * @author cseeley
 */
public class Card {

    private double balance;
    private double interestRate;
    private String type;

    public Card(double balance, double interestRate, String type) {
        this.balance = balance;
        this.interestRate = interestRate;
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public double getInterest(){
        BigDecimal bd = new BigDecimal(
                this.getBalance() * this.getInterestRate()
        ).setScale(2, RoundingMode.HALF_EVEN);
        return bd.doubleValue();
    }
    
    
}
