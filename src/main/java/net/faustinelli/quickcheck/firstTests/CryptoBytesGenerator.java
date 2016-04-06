/*
 * Project: quick-java-check
 * Author: Marco Faustinelli - Muzietto (contacts@faustinelli.net)
 * Web: http://faustinelli.wordpress.com/, http://www.github.com/muzietto, http://faustinelli.net/
 * Version: 1.0
 * The GPL 3.0 License - Copyright (c) 2015-2016 - The quick-java-check Project
 */

package net.faustinelli.quickcheck.firstTests;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

import java.io.UnsupportedEncodingException;

/**
 * Created by Marco Faustinelli (Muzietto) on 05/04/2016.
 * http://stackoverflow.com/questions/30211147/junit-quickcheck-generate-string-maching-a-pattern
 */
public class CryptoBytesGenerator extends Generator<Crypto.Bytes> {

    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String ALL_MY_CHARS = LOWERCASE_CHARS
            + UPPERCASE_CHARS + NUMBERS;

    public CryptoBytesGenerator() {
        super(Crypto.Bytes.class);
    }

    @Override
    public Crypto.Bytes generate(SourceOfRandomness random, GenerationStatus status) {

        Crypto.Bytes result = null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            int randomIndex = random.nextInt(ALL_MY_CHARS.length());
            sb.append(ALL_MY_CHARS.charAt(randomIndex));
        }
        try {
            result = new Crypto.Bytes(sb.toString());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
