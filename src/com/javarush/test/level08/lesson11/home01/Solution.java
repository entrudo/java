package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        //напишите тут ваш код. пункт 3
        Iterator<Cat> iterator = cats.iterator();
        int count = 0;
        while (iterator.hasNext()){
            count++;
            iterator.next();
            if (count > 2){
                iterator.remove();
            }
        }

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        //напишите тут ваш код. пункт 2
        Set<Cat> list = new HashSet<Cat>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        list.add(cat1);
        list.add(cat2);
        list.add(cat3);
        return list;
    }

    public static void printCats(Set<Cat> cats)
    {
        // пункт 4
        for (Cat s : cats){
            System.out.println(s.toString());
        }
    }

    // пункт 1
    public static class Cat{


    }
}
