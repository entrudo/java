package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        //напишите тут ваш код
        map.put("Stallone2", new Date("JUlY 10 1980"));
        map.put("Stallone3", new Date("AUGUST 13 1980"));
        map.put("Stallone4", new Date("May 2 1980"));
        map.put("Stallone5", new Date("March 6 1980"));
        map.put("Stallone6", new Date("February 19 1980"));
        map.put("Stallone7", new Date("September 28 1980"));
        map.put("Stallone8", new Date("JUNE 25 1980"));
        map.put("Stallone9", new Date("JULY 11 1980"));
        map.put("Stallone10", new Date("AUGUST 7 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            if (date.getMonth() > 4 && date.getMonth() < 8){
                iterator.remove();
            }
        }
    }
}
