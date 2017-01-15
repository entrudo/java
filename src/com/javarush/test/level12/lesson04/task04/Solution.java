package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    //Напишите тут ваши методы
    public static int min(int k, int i){
        return k < i ? k : i;
    }

    public static long min(long k, long i){
        return k < i ? k : i;
    }

    public static double min(double k, double i){
        return k < i ? k : i;
    }
}
