package com.langrsoft.app.fixtures;

import java.util.*;

import com.langrsoft.app.*;

import fit.*;

public class CheckinBook extends ColumnFixture {
    public Date checkoutDate;
    public Date checkinDate;

    public Date dueDate() {
        Checkout checkout = new Checkout(new Book(), checkoutDate);
        checkout.returnOn(checkinDate);
        return checkout.getDueDate();
    }

    public int daysLate() {
        Checkout checkout = new Checkout(new Book(), checkoutDate);
        checkout.returnOn(checkinDate);
        return checkout.daysLate();
    }

    public int fine() {
        Checkout checkout = new Checkout(new Book(), checkoutDate);
        checkout.returnOn(checkinDate);
        return checkout.amountToFine();
    }
}
