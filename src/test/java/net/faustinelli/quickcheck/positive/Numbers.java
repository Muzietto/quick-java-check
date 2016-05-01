/*
 * Project: quick-java-check
 * Author: Marco Faustinelli - Muzietto (contacts@faustinelli.net)
 * Web: http://faustinelli.wordpress.com/, http://www.github.com/muzietto, http://faustinelli.net/
 * Version: 1.0
 * The GPL 3.0 License - Copyright (c) 2015-2016 - The quick-java-check Project
 */

package net.faustinelli.quickcheck.positive;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

/**
 * Created by Marco Faustinelli (Muzietto) on 01/05/2016.
 */
@RunWith(JUnitQuickcheck.class)
public class Numbers {
    @Property (shrink = false)
    public void holds(@Positive int i) {
        assertTrue(i > 0);
    }
}