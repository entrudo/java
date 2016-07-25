package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        /*
        //Читаем числа с клавиатуры
        Scanner cr = new Scanner(System.in);
        //Объявляем массив
        int arr [] = new int[5];
        // Заполняем массив
        for (int i =0; i<arr.length; i++){
            arr[i] = cr.nextInt();
        }
        //Обозначаем стартовый минимальный элемент
        int min = arr[0];
        //Ищем минимальное значение
        for (int i =0; i<arr.length; i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        //Выводим минимальное значение из 5 цифр
        System.out.println(min);*/

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e)
    {
        int min=0;
        //return a < b ? a : b;
        if (a<b && a<c && a<d && a<e)
        {
            min=a;
        }else {
            if (b<a && b<c && b<d && b<e){
                min=b;
            }else {
                if (c<a && c<b && c<d && c<e){
                    min=c;
                }else {
                    if (d<a && d<b && d<c && d<e){
                        min=d;
                    }else {
                        if (e<a && e<b && e<c && e<d){
                            min=e;
                        }
                    }
                }
            }
        }
        return min;
    }

}
