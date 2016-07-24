package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int i =0;

        String k="S";
        int t=10;
        while (i<10){
            int n =1;
            //System.out.println(k);
            while (n<=10){
                System.out.print(k);
                n++;
            }
            System.out.println();
            i++;
        }

    }
}
