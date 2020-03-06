/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christopherseeley;

import com.christopherseeley.Wallet;
import com.christopherseeley.Card;
import java.util.ArrayList;

/**
 *
 * @author cseeley
 */
public class Person {

    private ArrayList<Wallet> wallets;

    public Person() {
        this.wallets = new ArrayList();
    }

    public ArrayList<Wallet> getWallets(){
        return this.wallets;
    }
    
    public int addWallet() {
        int id = this.wallets.size();
        this.wallets.add(new Wallet(id));
        return id;
    }

    public void addCardToWallet(int id, double balance,
            double interestRate, String type) {
        /*
         * Add a new Card object to a wallet
         */
        this.wallets.get(id).addCard(new Card(balance, interestRate, type));
    }

    public double getWalletTotalInterest(int id) {
        return this.wallets.get(id).calculateTotalInterest();
    }

    public double getTotalInterest() {
        double total = 0.00;
        total = this.wallets.stream().map(
                (wallet) -> wallet.calculateTotalInterest()
        ).reduce(total,
                (accumulator, _item) -> accumulator + _item);
        return total;
    }

}
