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
import net.faustinelli.model.tree.visitor.Tree;

/**
 * Created by Marco Faustinelli (Muzietto) on 05/04/2016.
 */
public class TreeGenerator extends Generator<Tree> {
    private TreeGenerators generators;

    public TreeGenerator() {
        super(Tree.class);
    }

    @Override
    public Tree generate(SourceOfRandomness random, GenerationStatus status) {


        try {
            return generators.NODE.instance().generate(random, status);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
