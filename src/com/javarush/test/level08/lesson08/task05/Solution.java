package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> list = new HashMap<String, String>();
        list.put("Ivanov1", "Ivan1");
        list.put("Ivanov2", "Ivan1");
        list.put("Ivanov3", "Ivan3");
        list.put("Ivanov4", "Ivan4");
        list.put("Ivanov5", "Ivan5");
        list.put("Ivanov6", "Ivan6");
        list.put("Ivanov7", "Ivan7");
        list.put("Ivanov8", "Ivan8");
        list.put("Ivanov9", "Ivan9");
        list.put("Ivanov10", "Ivan3");
        return list;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код

        HashMap<String, String> map2 = new HashMap<String, String>(map);
        HashMap<String, String> map3 = new HashMap<String, String>(map);

        //цикл по map2
        for (Map.Entry<String, String> pair : map2.entrySet())
        {
            //удаляем из map3 пару, которая соответствует pair
            map3.remove(pair.getKey());
            //проверяем на наличе  в map3 значений соответсвующего значению из pair
            if (map3.containsValue(pair.getValue()))
            {   //Если есть такие же значения - вызываем удаления текующего значения pair из переданной map
                removeItemFromMapByValue(map, pair.getValue());
            }
        }

//        HashMap<String, String> list2 = new HashMap<String, String>(map);
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//        ArrayList<String> list = new ArrayList<String>();
//        while (iterator.hasNext()){
//            Map.Entry<String, String> pair = iterator.next();
//            list.add(pair.getValue());
//        }
//        System.out.println(map);
//        for (int i = 0; i <list.size(); i++){
//            Iterator<Map.Entry<String, String>> iterator2 = list2.entrySet().iterator();
//            String name = list.get(i);
//            int count = 0;
//            while (iterator2.hasNext()){
//                Map.Entry<String, String> pair = iterator2.next();
//                String fName = pair.getValue();
//                if (fName.equals(name)){
//                    count++;
//                }
//                if (count > 1){
//                    removeItemFromMapByValue(map, fName);
//                }
//            }
//        }
        System.out.println(map);

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
