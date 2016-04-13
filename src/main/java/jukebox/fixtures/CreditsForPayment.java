package jukebox.fixtures;

import jukebox.sut.JukeBox;
import fit.*;

public class CreditsForPayment extends ColumnFixture {
    private double payment;

    private double credits;

    public void execute() { // executed after each table row
        this.credits = new JukeBox().calculateCredits(payment);
    }

    public void setPayment(double payment) { // setter method
        this.payment = payment;
    }

    public double credits() { // returning function because of question mark in the test
        return this.credits;
    }
}