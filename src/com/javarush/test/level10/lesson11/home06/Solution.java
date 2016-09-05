package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы

        private String name;
        private String sex;
        private int age;
        private int weight;
        private int height;
        private String like;

        public Human(){

        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, String sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, String sex, int age, int weight) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, String sex, int age, int weight, int height) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, String sex, int age, int weight, int height, String like) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.like = like;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int height, String like) {
            this.name = name;
            this.height = height;
            this.like = like;
        }

        public Human(int age, int weight, int height, String like) {
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.like = like;
        }
    }
}
