package com.christopherseeley;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cseeley
 */
public class WalletTest {


    /**
     * Test of getCardCount method, of class Wallet.
     */
    @Test
    public void testGetCardCount() {
        System.out.println("getCardCount");
        Wallet instance = new Wallet(0);
        int expResult = 0;
        int result = instance.getCardCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of addCard method, of class Wallet.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card card = new Card(100, 0.1, "VISA");
        Wallet instance = new Wallet(0);
        instance.addCard(card);
        assertEquals(instance.getCardCount(), 1);

    }

    /**
     * Test of calculateTotalInterest method, of class Wallet.
     */
    @Test
    public void testCalculateTotalInterest() {
        System.out.println("calculateTotalInterest");
        Wallet instance = new Wallet(1);
        double expResult = 0.0;
        double result = instance.calculateTotalInterest();
        assertEquals(expResult, result, 0.0);
    }
    
}
