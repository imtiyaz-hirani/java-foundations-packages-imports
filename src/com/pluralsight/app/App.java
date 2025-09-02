package com.pluralsight.app;
//Single class import
import com.pluralsight.finance.Money;

//Wildcard import (generally discouraged, but we show it for demo)
import com.pluralsight.reports.ReportsDemo;
import com.pluralsight.utils.*;

//Static import — allows us to use add() and mul() directly
import static com.pluralsight.utils.MathOps.add;

import java.math.BigDecimal;
public class App {
    public static void main(String[] args) {
        // Using finance.Money
        Money price = new Money(new BigDecimal("499.00"), "USD");
        System.out.println("Finance Money: " + price);

        // Using static import method directly
        int total = add(10, MathOps.mul(3, 4));
        System.out.println("Math Total: " + total);

        // Name clash demo — marketing.Money exists, so we use Fully Qualified Name (FQN)
        com.pluralsight.marketing.Money m2 = new com.pluralsight.marketing.Money();
        System.out.println("Marketing Money: " + m2.display("499"));

        // ReportsDemo
        ReportsDemo reports = new ReportsDemo();
        reports.generateReport();
    }
}
/**
 * OUTPUT:
 Finance Money: 499.00 USD
 Math Total: 22
 Marketing Money: $499 (Marketing Price)
 === Monthly Report ===
 Subscription: 999.00 USD
 Projected Yearly Revenue: $11988
 Marketing Display: $999 (Marketing Price)
 * */

/**
 * Packages created
 * Single-class imports
 * Wildcard imports
 * Static imports
 *  Fully Qualified Names
 *  Cross-package imports
 */