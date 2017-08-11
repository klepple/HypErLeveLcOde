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
public class CaesarCipherTest {
    
    public CaesarCipherTest() {
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
     * Test of encrypt method, of class CaesarCipher.
     */
    @Test
    public void testEncrypt() {
        System.out.println("encrypt");
        String plaintext = "";
        CaesarCipher instance = null;
        String expResult = "";
        String result = instance.encrypt(plaintext);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrypt method, of class CaesarCipher.
     */
    @Test
    public void testDecrypt() {
        System.out.println("decrypt");
        String ciphertext = "";
        CaesarCipher instance = null;
        String expResult = "";
        String result = instance.decrypt(ciphertext);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
