package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны».
 Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner cr = new Scanner(System.in);
        //System.out.println("Введите имя №1:");
        String Name1 = cr.nextLine();
        //System.out.println("Введите имя №2:");
        String Name2 = cr.nextLine();

        if (Name1.equals(Name2))
        {
            System.out.println("Имена идентичны");
        }
        else{
                if (Name1.length() == Name2.length())
                {
                    System.out.println("Длины имен равны");
                }
            }

    }
}
