package com.javarush.test.level14.lesson06.home01;

public class BelarusianHen extends Hen implements Country {
    @Override
    public int getCountOfEggsPerMonth() {
        return 16;
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + BELARUS + ". Я несу " +
                getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
