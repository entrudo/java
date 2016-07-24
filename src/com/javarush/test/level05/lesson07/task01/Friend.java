package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //напишите тут ваш код
    public String name = null;
    public String gender = null;
    public int age = 0;

    public void initialize(String name){
        this.name = name;
    }

    public void initialize(String name, int age){
        this.gender = name;
        this.age = age;
    }

    public  void initialize(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
