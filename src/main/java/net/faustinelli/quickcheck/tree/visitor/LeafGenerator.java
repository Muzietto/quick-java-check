/*
 * Project: quick-java-check
 * Author: Marco Faustinelli - Muzietto (contacts@faustinelli.net)
 * Web: http://faustinelli.wordpress.com/, http://www.github.com/muzietto, http://faustinelli.net/
 * Version: 1.0
 * The GPL 3.0 License - Copyright (c) 2015-2016 - The quick-java-check Project
 */

package net.faustinelli.quickcheck.tree.visitor;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;
import net.faustinelli.model.tree.visitor.Leaf;
import net.faustinelli.model.tree.visitor.Tree;
import net.faustinelli.quickcheck.firstTests.Crypto;

import java.io.UnsupportedEncodingException;

/**
 * Created by Marco Faustinelli (Muzietto) on 05/04/2016.
 */
public class LeafGenerator extends Generator<Tree> {

    public LeafGenerator() {
        super(Tree.class);
    }

    @Override
    public Tree generate(SourceOfRandomness random, GenerationStatus status) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < Tree.LABEL_SIZE; i++) {
            int randomIndex = random.nextInt(Tree.ALL_MY_CHARS.length());
            result.append(Tree.ALL_MY_CHARS.charAt(randomIndex));
        }
        return new Leaf(result.toString());
    }
}
