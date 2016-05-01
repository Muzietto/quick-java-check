/*
 * Project: quick-java-check
 * Author: Marco Faustinelli - Muzietto (contacts@faustinelli.net)
 * Web: http://faustinelli.wordpress.com/, http://www.github.com/muzietto, http://faustinelli.net/
 * Version: 1.0
 * The GPL 3.0 License - Copyright (c) 2015-2016 - The quick-java-check Project
 */

package net.faustinelli.quickcheck.coordinate;

import java.math.BigDecimal;

/**
 * http://pholser.github.io/junit-quickcheck/site/0.6/usage/sample-size.html
 */
public class Coordinate {
    private final BigDecimal latitude, longitude;

    public Coordinate(BigDecimal latitude, BigDecimal longitude) {
        // argument checks here...

        this.latitude = latitude;
        this.longitude = longitude;
    }

    public BigDecimal latitude() { return latitude; }
    public BigDecimal longitude() { return longitude; }
    public boolean inNorthernHemisphere() {
        return latitude.compareTo(BigDecimal.ZERO) > 0;
    }
}
