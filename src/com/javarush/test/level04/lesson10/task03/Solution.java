package com.javarush.test.level04.lesson10.task03;

import java.io.*;
import java.util.Scanner;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner cr = new Scanner(System.in);
        //System.out.println("Please enter the line");
        String er = cr.nextLine();
        //System.out.println("Please enter the number");
        int n = cr.nextInt();
        int i=1;
        while (i<=n){
            System.out.println(er);
            i++;
        }

    }
}
