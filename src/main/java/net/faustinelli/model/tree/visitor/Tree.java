/*
 * Project: quick-java-check
 * Author: Marco Faustinelli - Muzietto (contacts@faustinelli.net)
 * Web: http://faustinelli.wordpress.com/, http://www.github.com/muzietto, http://faustinelli.net/
 * Version: 1.0
 * The GPL 3.0 License - Copyright (c) 2016 - The quick-java-check Project
 */

package net.faustinelli.model.tree.visitor;

/**
 * Created by Marco Faustinelli (Muzietto) on 04/04/2016.
 */
public interface Tree extends Visited<TreeVisitor> {
    static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String NUMBERS = "0123456789";
    static final String ALL_MY_CHARS = LOWERCASE_CHARS
            + UPPERCASE_CHARS + NUMBERS;
    static final Integer LABEL_SIZE = 2;
}
