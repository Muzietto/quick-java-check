/*
 * Project: quick-java-check
 * Author: Marco Faustinelli - Muzietto (contacts@faustinelli.net)
 * Web: http://faustinelli.wordpress.com/, http://www.github.com/muzietto, http://faustinelli.net/
 * Version: 1.0
 * The GPL 3.0 License - Copyright (c) 2015-2016 - The quick-java-check Project
 */

package net.faustinelli.quickcheck.tree.visitor;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import net.faustinelli.model.tree.visitor.Tree;
import org.junit.runner.RunWith;

/**
 * Created by Marco Faustinelli (Muzietto) on 06/04/2016.
 */
@RunWith(JUnitQuickcheck.class)
public class FirstTreeQcTest {

    @Property(shrink = false)
    public void testXXXXXXX(@From(NodeGenerator.class) Tree tree) throws Exception {

    }

}
