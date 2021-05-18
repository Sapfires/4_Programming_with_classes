package com.epam.intro.subtask14;

import java.util.Random;
import java.util.UUID;

public class Account {
    private boolean isLocked = false;
    private double amount = 0.0;
    private String id;

    public Account(boolean isLocked, double amount) {
        this.isLocked = isLocked;
        this.amount = amount;
        this.id = UUID.randomUUID().toString().substring(1, 5);
    }

    public Account() {
        this(new Random().nextBoolean(), (new Random()).nextBoolean() ? -(new Random().nextInt(10)) : (new Random().nextInt(10)));
    }

    public double getAmount() {
        return amount;
    }

    public void addAmount(double extraAmount) {
        amount = amount + extraAmount;
    }

    public double withDraw(double requestedAmount) {
        amount = amount - requestedAmount;
        return amount;
    }

    public boolean getIsLocked() {
        return isLocked;
    }

    public void lock() {
        isLocked = true;
    }

    public void unlock() {
        isLocked = false;
    }

}
