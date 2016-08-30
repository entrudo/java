package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> family = new HashMap<>();
        String city = "";
        String lName = "";
        while (true){
            city = reader.readLine();
            if (city.isEmpty()){
                break;
            }
            lName = reader.readLine();
            family.put(city, lName);

        }
        Iterator<Map.Entry<String, String>> iterator = family.entrySet().iterator();

        String cCity = reader.readLine();

        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            if (cCity.equals(pair.getKey())){
                System.out.println(pair.getValue());
            }
        }


//        //list of addresses
//        List<String> addresses = new ArrayList<String>();
//        while (true)
//        {
//            String family = reader.readLine();
//            if (family.isEmpty()) break;
//
//            addresses.add(family);
//        }
//
//        //read home number
//        int houseNumber = Integer.parseInt(reader.readLine());
//
//        if (0 <= houseNumber && houseNumber < addresses.size())
//        {
//            String familySecondName = addresses.get(houseNumber);
//            System.out.println(familySecondName);
//        }
    }
}
