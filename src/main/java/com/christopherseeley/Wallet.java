/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christopherseeley;

import java.util.ArrayList;
import com.christopherseeley.Card;
/**
 *
 * @author cseeley
 */
public class Wallet {
    
    private ArrayList<Card> cards;
    private int id;
    private int cardCount;

    public Wallet(int id) {
        this.id = id;
        this.cards = new ArrayList();
        this.cardCount = 0;
    }

    public int getCardCount() {
        return cardCount;
    }

    public ArrayList<Card> getCards(){
        return this.cards;
    }
    
    public void addCard(Card card){
        this.cards.add(card);
        this.cardCount += 1; // only increment when you add a card to a wallet
    }
    
    public double calculateTotalInterest(){
        double totalInterest = 0.0;
        
        totalInterest = this.cards.stream().map(
                (card) -> card.getInterest()
        ).reduce(totalInterest, 
                (accumulator, _item) -> accumulator + _item);

        return totalInterest;
    }
    
}
