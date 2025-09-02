package com.pluralsight.finance;

import java.math.BigDecimal;

/**
 * Demonstrates encapsulation with private fields + getters
 * Uses BigDecimal for money representation → good practice to mention in narration
 * We will import this class in our App demo later
 */
public class Money {
    private final BigDecimal amount;
    private final String currency;

    public Money(BigDecimal amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
