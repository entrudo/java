package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        HashMap<String, String> month = new HashMap<>();
        month.put("January", "is 1 month");
        month.put("February", "is 2 month");
        month.put("March", "is 3 month");
        month.put("April", "is 4 month");
        month.put("May", "is 5 month");
        month.put("June", "is 6 month");
        month.put("July", "is 7 month");
        month.put("August", "is 8 month");
        month.put("September", "is 9 month");
        month.put("October", "is 10 month");
        month.put("November", "is 11 month");
        month.put("December", "is 12 month");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month2 = reader.readLine();

        Iterator<Map.Entry<String, String>> iterator = month.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getKey().equals(month2)){
                System.out.println(pair.getKey() + " " + pair.getValue());
            }
        }


    }

}
