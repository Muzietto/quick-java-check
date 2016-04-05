/*
 * Project: jcip-jciop
 * Author: Marco Faustinelli - Muzietto (contacts@faustinelli.net)
 * Web: http://faustinelli.wordpress.com/, http://www.github.com/muzietto, http://faustinelli.net/
 * Version: 1.0
 * The GPL 3.0 License - Copyright (c) 2015-2016 - The jcip-jciop Project
 */

package net.faustinelli.quickcheck.firstTests;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marco Faustinelli (Muzietto) on 05/04/2016.
 */
@RunWith(JUnitQuickcheck.class)
public class SymmetricKeyCryptographyProperties {

    @Property(shrink = false)
    public void decryptReversesEncrypt(@From(CryptoBytesGenerator.class)Crypto.Bytes bytes, @From(CryptoBytesGenerator.class)Crypto.Bytes keybits)
            throws Exception {

        Crypto crypto = new Crypto();

        byte[] ciphertext =
                crypto.encrypt(bytes.getBytes(), new String(keybits.getBytes()));

        assertEquals(
                bytes2String(bytes),
                new String(crypto.decrypt(ciphertext, new String(keybits.getBytes()))));
    }

    private String bytes2String(Crypto.Bytes bytes) {
        return new String(bytes.getBytes());
    }

}