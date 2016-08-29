package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //напишите тут ваш код

        char[] charr = s.toCharArray();

        for (int i = 0; i < charr.length-1; i++){
            charr[0] = Character.toUpperCase(charr[0]);

            if (charr[i] == ' '){
                charr[i+1] = Character.toUpperCase(charr[i+1]);
            }
        }
        for (int i = 0; i < charr.length; i++){
            System.out.print(charr[i]);
        }
    }


}
