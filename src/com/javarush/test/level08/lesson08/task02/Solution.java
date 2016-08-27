package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main(String[] args) {
        System.out.println(removeAllNumbersMoreThan10(createSet()));
    }


    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        HashSet<Integer> list = new HashSet<Integer>();
        for (int i = 0; i < 20; i++){
            list.add(i);
        }
        return list;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
        {
            int k = iterator.next();
            if (k > 10){
                iterator.remove();
            }
        }
        return set;
    }
}
