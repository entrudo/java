package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;
import java.util.Scanner;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        //напишите тут ваш код
        int N = Integer.parseInt(reader.readLine());
        if (N>0){
            for (int i=0; i<N; i++){
                int n = Integer.parseInt(reader.readLine());
                if (i == 0){
                    maximum=n;
                }else {
                if (n>maximum){
                    maximum=n;
                }}
            }
            System.out.println(maximum);
        }







        /*Scanner cr = new Scanner(System.in);
        //Ввод количество чиссел
        System.out.println("Введите число N");
        int size = cr.nextInt();
        if (size>0){
        //Объявляем массив
        int arr [] = new int[size];
        // Заполняем массив
        System.out.println("Введите числа на длину числа N");
        for (int i =0; i<arr.length; i++){
            arr[i] = cr.nextInt();
        }
        //Обозначаем стартовый максимальный элемент
        maximum = arr[0];
        //Ищем минимальное значение
        for (int i =0; i<arr.length; i++){
            if (maximum<arr[i]){
                maximum=arr[i];
            }
        }
        //Выводим максимальное значение из 5 цифр
        System.out.println(maximum);
        }else {
            System.out.println("Вы введи число меньше или рано 0");
        }*/

    }
}
