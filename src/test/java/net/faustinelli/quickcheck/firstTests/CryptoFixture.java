/*
 * Project: quick-java-check
 * Author: Marco Faustinelli - Muzietto (contacts@faustinelli.net)
 * Web: http://faustinelli.wordpress.com/, http://www.github.com/muzietto, http://faustinelli.net/
 * Version: 1.0
 * The GPL 3.0 License - Copyright (c) 2015-2016 - The quick-java-check Project
 */

package net.faustinelli.quickcheck.firstTests;

import fit.ColumnFixture;

import java.io.UnsupportedEncodingException;

/**
 * Created by Marco Faustinelli (Muzietto) on 14/04/2016.
 */
public class CryptoFixture extends ColumnFixture {
    public String string;
    public String key;

    public String encrypted() {
        byte[] plaintext = this.string.getBytes();
        Crypto crypto = new Crypto();
        try {
            return new String(crypto.encrypt(plaintext, this.key));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "exception!";
    }
}
