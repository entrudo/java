package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner sr = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = sr.nextInt();
        System.out.println("Введите второе число:");
        int num2 = sr.nextInt();
        System.out.println("Введите третье число:");
        int num3 = sr.nextInt();
        if (num2 == num3 && num1==num2 && num1==num3){
            System.out.println(num1 +" "+ num2 +" " +num3);
        }else
        {
            if (num1 == num2)
            {
                System.out.println(num1 + " " + num2);
            }
            if (num1 == num3)
            {
                System.out.println(num1 + " " + num3);
            }
            if (num2 == num3)
            {
                System.out.println(num2 + " " + num3);
            }
        }


    }
}