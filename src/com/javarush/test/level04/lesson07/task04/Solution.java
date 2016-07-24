package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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
        int a,b;

        if (num1>0 && num2>0 && num3>0){
            a=0;
            b=3;
            System.out.println("количество отрицательных чисел: " +a);
            System.out.println("количество положительных чисел: " +b);
        }else {
            if ((num1<0 && num2>0 && num3>0) ||  (num1>0 && num2<0 && num3>0) || (num1>0 && num2>0 && num3<0) ){
                a=1;
                b=2;
                System.out.println("количество отрицательных чисел: " +a);
                System.out.println("количество положительных чисел: " +b);
            }else {
                if (num1<0 && num2<0 && num3>0 ||  (num1>0 && num2<0 && num3<0) || (num1<0 && num2>0 && num3<0) ){
                    a=2;
                    b=1;
                    System.out.println("количество отрицательных чисел: " +a);
                    System.out.println("количество положительных чисел: " +b);
                }else {
                    a=3;
                    b=0;
                    System.out.println("количество отрицательных чисел: " +a);
                    System.out.println("количество положительных чисел: " +b);
                }
            }
        }

    }
}
