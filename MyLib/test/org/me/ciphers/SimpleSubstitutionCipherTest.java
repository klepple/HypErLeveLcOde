/*
 * Kahlia Lepple (c) 2017
 */
package org.me.ciphers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ELYEB
 */
public class SimpleSubstitutionCipherTest {
    
    public SimpleSubstitutionCipherTest() {
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
     * Test of encrypt method, of class SimpleSubstitutionCipher.
     */
    @Test
    public void testEncrypt() {
        System.out.println("encrypt");
        String plaintext = "defend the east wall of the castle";
        SimpleSubstitutionCipher instance = new SimpleSubstitutionCipher("zebracdfghijklmnopqstuvwxy");
        String expResult = "racalr sfa azqs vzjj mc sfa bzqsja";
        String result = instance.encrypt(plaintext);
        assertEquals(expResult, result);
    }

    /**
     * Test of decrypt method, of class SimpleSubstitutionCipher.
     */
    @Test
    public void testDecrypt() {
        System.out.println("decrypt");
        String ciphertext = "liv vovtu ap jstaoz alp latv ls dco";
        SimpleSubstitutionCipher instance = new SimpleSubstitutionCipher("yejwvmziaxbhtosqrdplckgnuf");
        String expResult = "the enemy is coming its time to run";
        String result = instance.decrypt(ciphertext);
        assertEquals(expResult, result);
    }
    
}
