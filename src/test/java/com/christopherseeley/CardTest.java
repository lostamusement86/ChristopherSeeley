package com.christopherseeley;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author cseeley
 */

public class CardTest {
    
    /**
     * Test of getBalance method, of class Card.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Card instance = new Card(100, 0.1, "visa");
        double expResult = 100.00;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setBalance method, of class Card.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        double balance = 100;
        Card instance = new Card(0.00, 0.1, "visa");
        instance.setBalance(balance);
        assertEquals(instance.getBalance(), balance, 0.0);
    }

    /**
     * Test of getInterestRate method, of class Card.
     */
    @Test
    public void testGetInterestRate() {
        System.out.println("getInterestRate");
        Card instance = new Card(100, 0.1, "visa");
        double expResult = 0.1;
        double result = instance.getInterestRate();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setInterestRate method, of class Card.
     */
    @Test
    public void testSetInterestRate() {
        System.out.println("setInterestRate");
        double interestRate = 0.24;
        Card instance = new Card(100, 0.1, "visa");
        instance.setInterestRate(interestRate);
        assertEquals(instance.getInterestRate(), interestRate, 0.0);
    }

    /**
     * Test of getType method, of class Card.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Card instance = new Card(100, 0.1, "visa");
        String expResult = "visa";
        String result = instance.getType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setType method, of class Card.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "mc";
        Card instance = new Card(100, 0.1, "visa");
        instance.setType(type);
        assertEquals(type, instance.getType());
    }

    /**
     * Test of getInterest method, of class Card.
     */
    @Test
    public void testGetInterest() {
        System.out.println("getInterest");
        Card instance = new Card(100, 0.1, "visa");
        double expResult = 10.00;
        assertEquals(expResult, instance.getInterest(), 0.0);
    }
    
}
