package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> list = new HashMap<String, String>();
        list.put("Ivanov1", "Ivan1");
        list.put("Ivanov2", "Ivan2");
        list.put("Ivanov3", "Ivan3");
        list.put("Ivanov4", "Ivan4");
        list.put("Ivanov5", "Ivan5");
        list.put("Ivanov6", "Ivan6");
        list.put("Ivanov7", "Ivan7");
        list.put("Ivanov8", "Ivan8");
        list.put("Ivanov9", "Ivan9");
        list.put("Ivanov10", "Ivan10");
        return list;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
         int count = 0;
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String fName = pair.getValue();
            if (name.equals(fName)){
                count+=1;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String lName = pair.getKey();
            if (lastName.equals(lName)){
                count++;
            }
        }
        return count;
    }
}
