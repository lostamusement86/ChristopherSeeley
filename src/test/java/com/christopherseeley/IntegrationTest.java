package com.christopherseeley;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author cseeley
 */
public class IntegrationTest {

    @Test
    public void testCase1() {
        /**
         * 1 person has 1 wallet and 3 cards (1 Visa, 1 MC 1 Discover) – Each
         * Card has a balance of $100 – calculate the total interest (simple
         * interest) for this person and per card interest.
         */
        //setup
        double[] expResults = {10.00, 5.00, 1.00};
        double expTotalResult = 16.0;
        double balance = 100.00;

        //Given
        Person p1 = new Person();
        int walletId1 = p1.addWallet();
        p1.addCardToWallet(walletId1, balance, 0.1, "Visa");
        p1.addCardToWallet(walletId1, balance, 0.05, "MC");
        p1.addCardToWallet(walletId1, balance, 0.01, "Discover");

        //assert Person total interest
        assertEquals(p1.getTotalInterest(), expTotalResult, 0.0);

        //assert simple interestrate per card
        for (Wallet w : p1.getWallets()) {
            for (Card c : w.getCards()) {
                assertEquals(c.getInterest(),
                        expResults[w.getCards().indexOf(c)],
                        0.0);
            }
        }

    }

    @Test
    public void testCase2() {
        /**
         * person has 2 wallets Wallet 1 has a Visa and Discover , wallet 2 a MC
         * - each card has $100 balance - calculate the total interest(simple
         * interest) for this person and interest per wallet
         */

        //setup
        double[] expResults = {11.00, 5.00};
        double expTotalResult = 16.0;
        double balance = 100.00;

        //Given
        Person p1 = new Person();
        int walletId1 = p1.addWallet();
        p1.addCardToWallet(walletId1, balance, 0.1, "Visa");
        p1.addCardToWallet(walletId1, balance, 0.01, "Discover");

        int walletId2 = p1.addWallet();
        p1.addCardToWallet(walletId2, balance, 0.05, "MC");

        //assert Person total interest
        assertEquals(p1.getTotalInterest(), expTotalResult, 0.0);

        for (Wallet w : p1.getWallets()) {
            assertEquals(w.calculateTotalInterest(),
                    expResults[p1.getWallets().indexOf(w)],
                    0.0);
        }
    }

    @Test
    public void testCase3() {
        /**
         * 2 people have 1 wallet each,  person 1 has 1 wallet , 
         * with 2 cards MC and visa person 2 has 1 wallet – 
         * 1 visa and 1 MC -  each card has $100 balance - calculate the 
         * total interest(simple interest) for each person and 
         * interest per wallet
         */
        //setup
        double[] p1ExpResults = {15.00};
        double[] p2ExpResults = {15.00};
        
        double expP1Interest = 15.0;
        double expP2Interest = 15.0;
        
        double balance = 100.00;
        
        //Given
        Person p1 = new Person();
        Person p2 = new Person();
        
        int p1wallet1ID = p1.addWallet();
        int p2wallet1ID = p2.addWallet();
        
        p1.addCardToWallet(p1wallet1ID, balance, 0.1, "Visa");
        p1.addCardToWallet(p1wallet1ID, balance, 0.05, "MC");
        
        p2.addCardToWallet(p2wallet1ID, balance, 0.1, "Visa");
        p2.addCardToWallet(p2wallet1ID, balance, 0.05, "MC");

        assertEquals(p1.getTotalInterest(), expP1Interest, 0.0);
        assertEquals(p2.getTotalInterest(), expP2Interest, 0.0);

        for (Wallet w : p1.getWallets()) {
            assertEquals(w.calculateTotalInterest(),
                    p1ExpResults[p1.getWallets().indexOf(w)],
                    0.0);
        }
        
        for (Wallet w : p2.getWallets()) {
            assertEquals(w.calculateTotalInterest(),
                    p2ExpResults[p2.getWallets().indexOf(w)],
                    0.0);
        }

    }
}
