package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).
Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        //напишите тут ваш код
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < alphabet.size(); i++){
            map.put(alphabet.get(i), 0);
        }

        for (String s : list){
            char[] temp = s.toCharArray();
            for (int i = 0; i < temp.length; i++){
                for (Character k : alphabet){
                    if (k.equals(temp[i])){
                        map.put(k, map.containsKey(k) ? map.get(k) + 1 : 0);
                    }
                }
            }

        }

        for (Map.Entry<Character, Integer> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

}
