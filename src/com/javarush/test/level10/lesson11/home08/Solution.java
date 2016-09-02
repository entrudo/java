package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String>[] list = new ArrayList[3];
        ArrayList<String> array1 = new ArrayList<String>();
        ArrayList<String> array2 = new ArrayList<String>();
        ArrayList<String> array3 = new ArrayList<String>();
        list[0] = new ArrayList<String>();
        list[1] = new ArrayList<String>();
        list[2] = new ArrayList<String>();
        list[0].add("äsdasd");
        list[0].add("qweqweasd");
        list[1].add("qweqweasd");
        list[1].add("qweqweasd");
        list[2].add("qweqweasd");
        list[2].add("qweqweasd");
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}