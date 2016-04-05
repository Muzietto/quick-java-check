/*
 * Project: jcip-jciop
 * Author: Marco Faustinelli - Muzietto (contacts@faustinelli.net)
 * Web: http://faustinelli.wordpress.com/, http://www.github.com/muzietto, http://faustinelli.net/
 * Version: 1.0
 * The GPL 3.0 License - Copyright (c) 2015-2016 - The jcip-jciop Project
 */

package net.faustinelli.quickcheck.firstTests;

import junit.framework.TestCase;

/**
 * Created by Marco Faustinelli (Muzietto) on 05/04/2016.
 */
public class CryptoTest extends TestCase{
    public void testEncrypt() throws Exception {

        byte[] bytes = new Crypto().encrypt("test".getBytes(), "key");
        assertEquals("test"/*"testkey"*/, new String(bytes));
        assertEquals(4/*7*/, bytes.length);
    }

    public void testDecrypt() throws Exception {
        byte[] encrypted = "test"/*"testkey"*/.getBytes();
        byte[] bytes = new Crypto().decrypt(encrypted, "key");
        assertEquals("test", new String(bytes));
        assertEquals(4, bytes.length);
    }

    public void testCryptDecrypt() throws Exception {
        Crypto cricri = new Crypto();
        String sss = "testtesttesttesttesttesttesttest";
        String keyo = "enricoenricoenricoenricoenricoenrico";
        byte[] encrypted = cricri.encrypt(sss.getBytes(), keyo);
        byte[] decrypted = cricri.decrypt(encrypted, keyo);

        assertEquals(sss, new String(decrypted));


    }
}
