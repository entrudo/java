package com.javarush.test.level14.lesson06.home01;

public class MoldovanHen extends Hen implements Country {
    @Override
    public int getCountOfEggsPerMonth() {
        return 14;
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + MOLDOVA + ". Я несу " +
                getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
