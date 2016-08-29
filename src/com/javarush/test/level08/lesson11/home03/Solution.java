package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        //напишите тут ваш код
        HashMap<String, String> list = new HashMap<>();
        list.put("Ivanov1", "Ivan1");
        list.put("Ivanov2", "Ivan1");
        list.put("Ivanov3", "Ivan3");
        list.put("Ivanov4", "Ivan4");
        list.put("Ivanov5", "Ivan5");
        list.put("Ivanov6", "Ivan6");
        list.put("Ivanov7", "Ivan7");
        list.put("Ivanov1", "Ivan8");
        list.put("Ivanov9", "Ivan9");
        list.put("Ivanov10", "Ivan10");

        return list;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
