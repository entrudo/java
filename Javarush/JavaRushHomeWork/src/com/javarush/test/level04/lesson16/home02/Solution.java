package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.Scanner;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        Scanner cr = new Scanner(System.in);
        int num1 = cr.nextInt();
        int num2 = cr.nextInt();
        int num3 = cr.nextInt();
        if (num1 >num2 && num1<num3){
            System.out.println(num1);
        }else {
            if (num2 >num1 && num2<num3){
                System.out.println(num2);
            }else {
                System.out.println(num3);
            }
        }
    }
}
