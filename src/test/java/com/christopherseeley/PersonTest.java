/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christopherseeley;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;


/**
 *
 * @author cseeley
 */
public class PersonTest {
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getWallets method, of class Person.
     */
    @Test
    public void testGetWallets() {
        System.out.println("getWallets");
        Person instance = new Person();
        assertNotNull(instance.getWallets());
    }

    /**
     * Test of addWallet method, of class Person.
     */
    @Test
    public void testAddWallet() {
        System.out.println("addWallet");
        Person instance = new Person();
        int expResult = 0;
        int result = instance.addWallet();
        assertEquals(expResult, result);
    }

    /**
     * Test of addCardToWallet method, of class Person.
     */
    @Test
    public void testAddCardToWallet() {
        System.out.println("addCardToWallet");
        int id = 0;
        double balance = 100.0;
        double interestRate = 0.1;
        String type = "Visa";
        Person instance = new Person();
        instance.addWallet();
        instance.addCardToWallet(id, balance, interestRate, type);
        
        assertEquals(instance.getWallets().get(id).getCardCount(), 1, 0);
    }

    /**
     * Test of getWalletTotalInterest method, of class Person.
     */
    @Test
    public void testGetWalletTotalInterest() {
        System.out.println("getWalletTotalInterest");
        int id = 0;
        Person instance = new Person();
        instance.addWallet();
        double expResult = 0.0;
        double result = instance.getWalletTotalInterest(id);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getTotalInterest method, of class Person.
     */
    @Test
    public void testGetTotalInterest() {
        System.out.println("getTotalInterest");
        Person instance = new Person();
        double expResult = 0.0;
        double result = instance.getTotalInterest();
        assertEquals(expResult, result, 0.0);
    }
    
}
