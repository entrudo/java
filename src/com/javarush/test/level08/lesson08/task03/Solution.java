package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args) {
        System.out.println(getCountTheSameFirstName(createMap(), "Петя1"));
        System.out.println(getCountTheSameLastName(createMap(), "Иванов1"));
    }
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> list = new HashMap<String, String>();
        list.put("Иванов1", "Петя1");
        list.put("Иванов2", "Петя1");
        list.put("Иванов3", "Петя3");
        list.put("Иванов1", "Петя4");
        list.put("Иванов5", "Петя5");
        list.put("Иванов6", "Петя6");
        list.put("Иванов7", "Петя7");
        list.put("Иванов8", "Петя8");
        list.put("Иванов9", "Петя9");
        list.put("Иванов10", "Петя10");
        return list;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код

        int count = 0;
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int count = 0;
        return count;
    }
}
