/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher;

import org.me.ciphers.CaesarCipher;
import org.me.ciphers.SimpleSubstitutionCipher;

/**
 *
 * @author ELYEB
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String plaintext = "The quick brown fox jumps over the lazy dog";
        CaesarCipher julius = new CaesarCipher(12);
        String cipherText = julius.encrypt(plaintext);
        System.out.println("Plaintext = " + plaintext);
        System.out.println("Encrypted message = " + cipherText);
        System.out.println("Decrypted message = " + julius.decrypt(cipherText));
       
        System.out.println("");

        SimpleSubstitutionCipher simpleton = new SimpleSubstitutionCipher("zebracdfghijklmnopqstuvwxy");
        cipherText = simpleton.encrypt(plaintext);
        System.out.println("Plaintext = " + plaintext);
        System.out.println("Encrypted message = " + cipherText);
        System.out.println("Decrypted message = " + simpleton.decrypt(cipherText));
    }
}
