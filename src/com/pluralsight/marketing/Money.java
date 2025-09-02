package com.pluralsight.marketing;

/**
 * Money class in the marketing package to simulate a name clash scenario
 * with Money class of finance package
 *
 * Helps us demonstrate fully-qualified names
 */
public class Money {

    public String display(String value) {
        return "$" + value + " (Marketing Price)";
    }
}
