package com.javarush.test.level14.lesson08.home09;

public class USD extends Money {
    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
