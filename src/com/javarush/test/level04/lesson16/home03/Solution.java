package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        /*Scanner cr  =   new Scanner(System.in);
        int n = 0;
        for (boolean Exit = false; !Exit;){
            //System.out.println("Please enter number: ");
            String s = cr.nextLine();
            int j = Integer.parseInt(s);
            n=n+j;
            //System.out.println(n);
            if (Exit = s.equals("-1")){
                System.out.println(n);
                break;
            }

        }*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;//создаём число суммы и инициализируем его

        //входим в бесконечный цикл
        while (true){
            //считываем число
            int i = Integer.parseInt(reader.readLine());
            //прибавляем его к сумме
            sum+=i;
            //в конце проверяем, если число было -1, то завершаем цикл
            if (i==-1) break;
        }
        //после завершения цикла печатаем сумму
        System.out.println(sum);
    }
}
