/*
 * Project: quick-java-check
 * Author: Marco Faustinelli - Muzietto (contacts@faustinelli.net)
 * Web: http://faustinelli.wordpress.com/, http://www.github.com/muzietto, http://faustinelli.net/
 * Version: 1.0
 * The GPL 3.0 License - Copyright (c) 2015-2016 - The quick-java-check Project
 */

package net.faustinelli.quickcheck.tree.visitor;

import com.pholser.junit.quickcheck.generator.Generator;
import net.faustinelli.model.tree.visitor.Tree;

/**
 * Created by Marco Faustinelli (Muzietto) on 06/04/2016.
 */
public enum TreeGenerators {
    EMPTY(EmptyGenerator.class), LEAF(LeafGenerator.class), NODE(NodeGenerator.class);

    private Class c;

    TreeGenerators(Class c) {
        this.c = c;
    }

    public Generator<Tree> instance() throws Exception {
        return (Generator<Tree>) this.c.getConstructor().newInstance();
    }
}
