package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    public String name;
    public int weight;
    public int age;
    public String color;
    public String address;

    public void initialize(String name)
    {
        this.name = name;
        this.weight=10;
        this.color=null;
        this.address = null;
        this.age= 2;

    }

    public void initialize(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color=null;
        this.address = null;
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.color=null;
        this.address = null;
    }

    public void initialize(int weight, String color){
        this.weight=weight;
        this.color=color;
        this.address = null;
        this.name = null;
        this.age= 2;
    }

    public void initialize(int weight, String color, String address){
        this.weight=weight;
        this.color=color;
        this.address=address;
        this.name = null;
        this.age= 2;
    }

}
