/*
 * Project: quick-java-check
 * Author: Marco Faustinelli - Muzietto (contacts@faustinelli.net)
 * Web: http://faustinelli.wordpress.com/, http://www.github.com/muzietto, http://faustinelli.net/
 * Version: 1.0
 * The GPL 3.0 License - Copyright (c) 2015-2016 - The quick-java-check Project
 */

package net.faustinelli.quickcheck.coordinate;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import java.math.BigDecimal;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assume.assumeTrue;

/**
 * http://pholser.github.io/junit-quickcheck/site/0.6/usage/sample-size.html
 */
@RunWith(JUnitQuickcheck.class)
public class Geography {
    @Property(trials = 250)
    public void northernHemisphere(
            @From(Coordinates.class) Coordinate c) {

        assumeTrue(c.latitude().compareTo(BigDecimal.ZERO) > 0);

        assertTrue(c.inNorthernHemisphere());
    }
}