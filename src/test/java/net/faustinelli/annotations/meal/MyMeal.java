/*
 * Project: quick-java-check
 * Author: Marco Faustinelli - Muzietto (contacts@faustinelli.net)
 * Web: http://faustinelli.wordpress.com/, http://www.github.com/muzietto, http://faustinelli.net/
 * Version: 1.0
 * The GPL 3.0 License - Copyright (c) 2015-2016 - The quick-java-check Project
 */

package net.faustinelli.annotations.meal;

/**
 * Created by Marco Faustinelli (Muzietto) on 03/05/2016.
 */
public class MyMeal {

    @Meal(value = "breakfast", mainDish = "cereal")
    //@Meal(value = "lunch", mainDish="pizza")
    //@Meal(value = "dinner", mainDish="salad")
    public void evaluateDiet(){

    }
}
