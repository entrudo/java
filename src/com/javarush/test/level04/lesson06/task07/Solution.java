package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner cr = new Scanner(System.in);
        int Num1 = cr.nextInt();
        int Num2 = cr.nextInt();
        int Num3 = cr.nextInt();

        if (Num1 != Num2 && Num1 != Num3){
            System.out.println("1");
        }
        if (Num2 != Num1 && Num2 != Num3){
            System.out.println("2");
        }
        if (Num3 != Num2 && Num3 != Num1){
            System.out.println("3");
        }

    }
}
