package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        //напишите тут ваш код
        Scanner cr = new Scanner(System.in);
        String i = cr.nextLine();
        return i;
    }

    public static int readInt() throws Exception
    {
        //напишите тут ваш код
        Scanner cr = new Scanner(System.in);
        int k = cr.nextInt();
        return k;

    }

    public static double readDouble() throws Exception
    {
        //напишите тут ваш код
        Scanner cr = new Scanner(System.in);
        double k = cr.nextDouble();
        return k;

    }

    public static boolean readBoolean() throws Exception
    {
        //напишите тут ваш код
        Scanner cr = new Scanner(System.in);
        boolean bol = cr.nextBoolean();
        return bol;
    }
}
