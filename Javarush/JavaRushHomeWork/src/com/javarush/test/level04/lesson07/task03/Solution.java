package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner cr = new Scanner(System.in);
        int num1 = cr.nextInt();
        int num2 = cr.nextInt();
        int num3 = cr.nextInt();

        if (num1>0 && num2>0 && num3>0){
            System.out.println("3");
        }else {
            if (num1<0 && num2>0 && num3>0){
                System.out.println("2");
            }else {
                if (num1<0 && num2<0 && num3>0){
                    System.out.println("1");
                }else {
                    System.out.println("0");
                }
            }
        }


    }
}
