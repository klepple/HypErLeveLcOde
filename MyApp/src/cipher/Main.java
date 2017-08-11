/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher;

import org.me.ciphers.CaesarCipher;

/**
 *
 * @author ELYEB
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String plaintext = "Hello World";
        CaesarCipher julius = new CaesarCipher(3);
        String cipherText = julius.encrypt(plaintext);
        System.out.println("Plaintext = " + plaintext);
        System.out.println("Encrypted message = " + cipherText);
        System.out.println("Decrypted message = " + julius.decrypt(cipherText));
        
    }
    
}
