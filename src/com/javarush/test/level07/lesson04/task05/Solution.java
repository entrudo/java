package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner cr = new Scanner(System.in);
        int[] mas1 = new int[20];

        for (int i =0; i<mas1.length; i++){
            mas1[i]=cr.nextInt();
        }

        int[] mas2 = new int[10];
        int[] mas3 = new int[10];

        for (int i = 0; i<mas2.length; i++){
            mas2[i] = mas1[i];
        }
        for (int j =0, i=mas3.length; i<mas1.length; i++){
            mas3[j]=mas1[i];
            //j+=1;
            System.out.println(mas3[j]);
        }

    }

}
