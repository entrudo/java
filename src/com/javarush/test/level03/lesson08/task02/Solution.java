package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
       BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
       String nam = read.readLine();
       String sNum1 = read.readLine();
       int iNum1 = Integer.parseInt(sNum1);
       String sNum2 = read.readLine();
       int iNum2 = Integer.parseInt(sNum2);
       System.out.println(nam + " получает " + iNum1 + " через "+ iNum2 + " лет.");
    }
}