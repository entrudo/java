package com.javarush.test.level14.lesson08.home09;

public abstract class Money
{
    private double money;

    public double Money(double amount)
    {
        this.money = amount;
        return money;
    }

    public abstract double getAmount();

    public abstract String getCurrencyName();
}

