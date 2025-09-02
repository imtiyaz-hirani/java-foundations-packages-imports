package com.pluralsight.reports;
/**
 * Demonstrates cross-package imports and shows how we can import
 * classes from multiple packages into one file
 * */

// Importing Money from finance package
import com.pluralsight.finance.Money;

// Importing MathOps for static utility methods
import java.math.BigDecimal;

import static com.pluralsight.utils.MathOps.*;

public class ReportsDemo {

    public void generateReport() {
        // Use finance.Money
        Money subscription = new Money(new BigDecimal("999.00"), "USD");
        System.out.println("=== Monthly Report ===");
        System.out.println("Subscription: " + subscription);

        // Use MathOps directly via static import
        int yearly = mul(999, 12);
        System.out.println("Projected Yearly Revenue: $" + yearly);

        // Marketing Money (using FQN intentionally)
        com.pluralsight.marketing.Money marketingMoney = new com.pluralsight.marketing.Money();
        System.out.println("Marketing Display: " + marketingMoney.display("999"));
    }
}
