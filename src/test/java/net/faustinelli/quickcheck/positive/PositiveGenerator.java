/*
 * Project: quick-java-check
 * Author: Marco Faustinelli - Muzietto (contacts@faustinelli.net)
 * Web: http://faustinelli.wordpress.com/, http://www.github.com/muzietto, http://faustinelli.net/
 * Version: 1.0
 * The GPL 3.0 License - Copyright (c) 2015-2016 - The quick-java-check Project
 */

package net.faustinelli.quickcheck.positive;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

import java.util.List;

/**
 * Created by Marco Faustinelli (Muzietto) on 01/05/2016.
 */
public class PositiveGenerator extends Generator<Integer> {
    private Positive positive;

    protected PositiveGenerator(Class<Integer> type) {
        super(type);
    }

    protected PositiveGenerator(List<Class<Integer>> types) {
        super(types);
    }

    @Override
    public Integer generate(
            SourceOfRandomness random,
            GenerationStatus status) {

        int value = random.nextInt();
        return positive != null ? Math.abs(value) : value;
    }

    public void configure(Positive positive) {
        this.positive = positive;
    }
}