package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть.
Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        result.add(cat1);
        result.add(cat2);
        result.add(cat3);
        result.add(cat4);

        return result;
    }

    public static Set<Dog> createDogs()
    {
        //напишите тут ваш код
        HashSet<Dog> dogs = new HashSet<Dog>();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        //напишите тут ваш код
        HashSet<Object> join = new HashSet<Object>();
        Iterator<Object> iterator3 = join.iterator();
        Iterator<Cat> iterator = cats.iterator();
        Iterator<Dog> iterator2 = dogs.iterator();
        while (iterator.hasNext()){
            join.add(iterator.next());
        }
        while (iterator2.hasNext()){
            join.add(iterator2.next());
        }
        return join;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        //напишите тут ваш код

        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets)
    {
        //напишите тут ваш код
        Iterator<Object> iterator = pets.iterator();
        while (iterator.hasNext()){
            Object pr = iterator.next();
            System.out.println(pr);
        }

    }

    //напишите тут ваш код
    public static class Cat{}
    public static class Dog{}
}
