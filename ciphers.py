# Kahlia Lepple (c) 2018

from io import StringIO

PLAIN_ALPHABET = ['a', 'b', 'c', 'd', 'e',
                  'f', 'g', 'h', 'i', 'j',
                  'k', 'l', 'm', 'n', 'o',
                  'p', 'q', 'r', 's', 't',
                  'u', 'v', 'w', 'x', 'y', 'z']


class CaesarCipher:
    def __init__(self, key=10):
        self.key = key

    def encrypt(self, plain_text):
        """Encrypts the plaintext using a caesar cipher."""
        cipher_text = StringIO()
        for i in range(len(plain_text)):
            char = plain_text[i]
            if char == ' ':
                cipher_text.write(' ')
            else:
                alphabet_index = PLAIN_ALPHABET.index(char)
                caesar_index = (alphabet_index + self.key) % 26
                cipher_text.write(PLAIN_ALPHABET.__getitem__(caesar_index))
        return cipher_text

    def decrypt(self, cipher_text):
        """Decrypts the ciphertext that has been encrypted using a caesar cipher."""
        plain_text = StringIO()
        for i in range(len(cipher_text)):
            char = cipher_text[i]
            if char == ' ':
                plain_text.write(' ')
            else:
                alphabet_index = PLAIN_ALPHABET.index(char)
                caesar_index = ((alphabet_index - self.key) % 26 + 26) % 26
                plain_text.write(PLAIN_ALPHABET.__getitem__(caesar_index))
        return plain_text


class SimpleSubstitutionCipher:
    def __init__(self, key='abc'):
        self.key = key
