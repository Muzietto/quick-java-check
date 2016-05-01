/*
 * Project: quick-java-check
 * Author: Marco Faustinelli - Muzietto (contacts@faustinelli.net)
 * Web: http://faustinelli.wordpress.com/, http://www.github.com/muzietto, http://faustinelli.net/
 * Version: 1.0
 * The GPL 3.0 License - Copyright (c) 2015-2016 - The quick-java-check Project
 */

package net.faustinelli.quickcheck.coordinate;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * http://pholser.github.io/junit-quickcheck/site/0.6/usage/sample-size.html
 */
public class Coordinates extends Generator<Coordinate> {
    protected Coordinates(Class<Coordinate> type) {
        super(type);
    }

    protected Coordinates(List<Class<Coordinate>> types) {
        super(types);
    }

    @Override public Coordinate generate(
            SourceOfRandomness random,
            GenerationStatus status) {

        return new Coordinate(
                BigDecimal.valueOf(random.nextDouble(-90, 90))
                        .setScale(6, RoundingMode.CEILING),
                BigDecimal.valueOf(random.nextDouble(-180, 180))
                        .setScale(6, RoundingMode.CEILING));
    }
}