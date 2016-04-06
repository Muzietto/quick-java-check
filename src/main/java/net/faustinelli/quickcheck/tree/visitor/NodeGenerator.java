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
import net.faustinelli.model.tree.visitor.Node;
import net.faustinelli.model.tree.visitor.Tree;

/**
 * Created by Marco Faustinelli (Muzietto) on 05/04/2016.
 */
public class NodeGenerator extends Generator<Tree> {
    private TreeGenerators generators;

    public NodeGenerator() {
        super(Tree.class);
    }

    @Override
    public Tree generate(SourceOfRandomness random, GenerationStatus status) {
        Integer attempts = status.attempts();
        Tree left = null;
        Tree right = null;

        try {
            left = nextBranch(random, status);
            right = nextBranch(random, status);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Node(left, right);
    }

    private Tree nextBranch(SourceOfRandomness random, GenerationStatus status) throws Exception {
        Double randomDouble = random.nextDouble();
        if (randomDouble < 0.5) {
            return this.generators.NODE.instance().generate(random, status);
        }
        if (randomDouble < 0.9) {
            return this.generators.LEAF.instance().generate(random, status);
        }
        return generators.EMPTY.instance().generate(random, status);
    }
}
