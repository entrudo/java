package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    public String name;
    public int height;
    public String color;

    public void initialize(String name){
        this.name =name;
        this.height = 1000;
        this.color=null;
    }

    public void initialize(String name, int height){
        this.name=name;
        this.height=height;
        this.color=null;
    }

    public void initialize(String name, int height, String color){
        this.name=name;
        this.height=height;
        this.color=color;
    }


}
