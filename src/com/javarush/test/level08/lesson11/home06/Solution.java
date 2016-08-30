package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> list = new ArrayList<Human>();
        ArrayList<Human> Children = new ArrayList<Human>();
        ArrayList<Human> otecc = new ArrayList<Human>();
        ArrayList<Human> matt = new ArrayList<Human>();

        Human child1 = new Human("Pipi", true, 7, list);
        Human child2 = new Human("Pip", false, 4, list);
        Human child3 = new Human("Ipi", true, 2, list);
        Children.add(child1);
        Children.add(child2);
        Children.add(child3);
        Human Otec = new Human("Oleg", true, 40, Children);
        otecc.add(Otec);
        Human mat = new Human("Vika", false, 41, Children);
        matt.add(mat);
        Human ded1 = new Human("Ivan", true, 76, otecc);
        Human ded2 = new Human("Petr", true, 75, matt);
        Human Babka1 = new Human("Olga", false, 74, otecc);
        Human Babka2 = new Human("Inna", false, 77, matt);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(Babka1);
        System.out.println(Babka2);
        System.out.println(Otec);
        System.out.println(mat);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);


    }

    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private Boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, Boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
