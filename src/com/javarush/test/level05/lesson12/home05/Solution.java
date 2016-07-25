package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner cr = new Scanner(System.in);
        int sum =0;
         for (; true;) {
            String k = cr.nextLine();
            if (k.equals("сумма")) {
                System.out.println(sum);
                break;
            }
            int i = Integer.parseInt(k);
            sum += i;
        }
    }
}
