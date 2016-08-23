package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human ded1 = new Human("Oleg", true, 70, null, null);
        Human ded2 = new Human("Ivan", true, 69, null, null);
        Human babka1 = new Human("Olga", false, 71, null, null);
        Human babka2 = new Human("Ivana", false, 68, null, null);
        Human otec = new Human("Igor", true, 40, ded1, babka1);
        Human mat = new Human("Inna", false, 38, ded2, babka2);
        Human child1 = new Human("Kira", false, 7, otec, mat);
        Human child2 = new Human("Kir", false, 8, otec, mat);
        Human child3 = new Human("Kra", false, 5, otec, mat);

        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(babka1.toString());
        System.out.println(babka2.toString());
        System.out.println(otec.toString());
        System.out.println(mat.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }



    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
