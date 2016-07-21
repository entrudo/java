package com.javarush.test.level04.lesson16.home04;

import java.io.*;
import java.util.Scanner;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        Scanner cr = new Scanner(System.in);
        String name = cr.nextLine();
        int y = cr.nextInt();
        int m = cr.nextInt();
        int d = cr.nextInt();
        System.out.println("Меня зовут " +name);
        System.out.println("Я родился " +d +"."+m+"."+y);
    }

    // test integration with github at 4 p.m. and ninght ads
    // test new change for github
}
