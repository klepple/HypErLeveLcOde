/*
 * Kahlia Lepple (c) 2017
 */
package org.me.ciphers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ELYEB
 */
public class SimpleSubstitutionCipher {
    private final String key;
    private final List<Character> plainAlphabet = Arrays.asList('a', 'b', 'c', 'd', 'e',
                                  'f', 'g', 'h', 'i', 'j',
                                  'k', 'l', 'm', 'n', 'o',
                                  'p', 'q', 'r', 's', 't',
                                  'u', 'v', 'w', 'x', 'y', 'z');

  public SimpleSubstitutionCipher(String key){
      this.key = key;
  }
  
  private List<Integer> generateCipherAlphabet(){
      List<Integer> cipherAlphabet = new ArrayList<>();
      for(int i = 0; i < key.length(); i++){
          char cipherChar = key.charAt(i);
          int location = plainAlphabet.indexOf(cipherChar);
          cipherAlphabet.add(location);
      }
      return cipherAlphabet;
  }
  
  public String encrypt(String plaintext){
      List<Integer> cipherAlphabet = this.generateCipherAlphabet();
      StringBuilder ciphertext = new StringBuilder();
      plaintext = plaintext.toLowerCase();
      
      for(int i = 0; i < plaintext.length(); i++){
        char curr = plaintext.charAt(i);
        if(curr == ' '){
            ciphertext.append(" ");
        } else {
            int plainIndex = plainAlphabet.indexOf(curr);
            int cipherIndex = cipherAlphabet.get(plainIndex);
            ciphertext.append(plainAlphabet.get(cipherIndex));
        }
      }
      
      return ciphertext.toString();
  }
  public String decrypt(String ciphertext){
      List<Integer> cipherAlphabet = this.generateCipherAlphabet();
      StringBuilder plaintext = new StringBuilder();
      ciphertext = ciphertext.toLowerCase();
      
      for(int i = 0; i < ciphertext.length(); i++){
        char curr = ciphertext.charAt(i);
        if(curr == ' '){
            plaintext.append(" ");
        } else {
            int plainIndex = plainAlphabet.indexOf(curr);
            int cipherIndex = cipherAlphabet.indexOf(plainIndex);
            plaintext.append(plainAlphabet.get(cipherIndex));
        }
      }
      
      return plaintext.toString();
  }
}
