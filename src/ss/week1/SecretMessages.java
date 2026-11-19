package ss.week1;

import static java.lang.Character.PARAGRAPH_SEPARATOR;
import static java.lang.Character.toLowerCase;

/**
 * Two classic ciphers, the Caesar cipher and the Vigenere cipher. Only the
 * letters a to z and A to Z are encrypted, and they keep their case; all
 * other characters stay the same.
 */
public class SecretMessages {
    /**
     * Decrypt a test vigenere ciphertext with the given key and print to the console.
     *
     * @param args Commandline arguments (unused)
     */
    public static void main(String[] args) {
        String ciphertext = "Xbeeltn aae zvnrtwqeme!";
        String key = "java";
        System.out.println("Plaintext: " + vigenereDecrypt(ciphertext, key));
    }
    /**
     * Shifts a letter the given number of places further in the alphabet,
     * wrapping around from z to a. The letter keeps its case.
     * @param c the character to shift
     * @param shift the number of places, from 0 to 25
     * @return the shifted letter, or c itself if it is not one of the
     *         letters a to z or A to Z
     */
    public static char shiftLetter(char c, int shift) {
        //char lower = toLowerCase(c);
        if (c >= 'a' && c <= 'z') {
            return (char) ((c - 'a' + shift) % 26 + 'a');
        } else if (c >= 'A' && c <= 'Z') {
            return (char) ((c - 'A' + shift) % 26 + 'A');
        }
        return c;
    }

    /**
     * Encrypts a text with the Caesar cipher: every letter is shifted the
     * given number of places.
     * @param text the text to encrypt
     * @param shift the number of places, from 0 to 25
     * @return the encrypted text
     */
    public static String caesarEncrypt(String text, int shift) {
        char[] plaintext = text.toCharArray();
        char[] ciphertext = new char[plaintext.length];
        for (int i = 0; i < plaintext.length; i++) {
            ciphertext[i] = shiftLetter(plaintext[i], shift);
        }
        return new String(ciphertext);
    }

    /**
     * Decrypts a text that was encrypted with caesarEncrypt.
     * @param text the text to decrypt
     * @param shift the shift that was used to encrypt it, from 0 to 25
     * @return the decrypted text
     */
    public static String caesarDecrypt(String text, int shift) {
        return caesarEncrypt(text, 26 - shift);
    }

    /**
     * Encrypts a text with the Vigenere cipher: every letter is shifted
     * by the next letter of the key (a shifts by 0, b by 1, ...,
     * z by 25). When the key is used up, it starts again. Other
     * characters do not use up a letter of the key.
     * @param text the text to encrypt
     * @param key the key; at least one letter, only a to z
     * @return the encrypted text
     */
    public static String vigenereEncrypt(String text, String key) {
        char[] plaintext = text.toCharArray();
        char[] ciphertext = new char[plaintext.length];
        int keyIdx = 0;
        for (int i = 0; i < plaintext.length; i++) {
            int shift = 0;
            if (toLowerCase(plaintext[i]) >= 'a' && toLowerCase(plaintext[i]) <= 'z') {
                shift = (int) (key.charAt(keyIdx % key.length()) - 'a');
                keyIdx++;
            }
            ciphertext[i] = shiftLetter(plaintext[i], shift);
        }
        return new String(ciphertext);
    }

    /**
     * Decrypts a text that was encrypted with vigenereEncrypt.
     * @param text the text to decrypt
     * @param key the key that was used to encrypt it
     * @return the decrypted text
     */
    public static String vigenereDecrypt(String text, String key) {
        char[] inverseKey = new char[key.length()];

        for (int i = 0; i < inverseKey.length; i++) {
            inverseKey[i] = (char) ('a' + (26 - (key.charAt(i) - 'a')));
        }

        return vigenereEncrypt(text, new String(inverseKey));
    }
}
