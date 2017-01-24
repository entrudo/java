package com.javarush.test.level14.lesson08.bonus01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here
        try {
            double d = Double.parseDouble("qwe");
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            int[] array = new int[1];
            int temp = array[2];
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            Object szStr[] = new String[10];
            szStr[0] = new Character('*');
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            Object ch = new Character('*');
            System.out.println((Byte)ch);
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            int[] nNegArray = new int[-5];
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            String szShortString = "123";
            char chr = szShortString.charAt(10);
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException();
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            throw new IllegalMonitorStateException();
        } catch (Exception e){
            exceptions.add(e);
        }


    }
}
