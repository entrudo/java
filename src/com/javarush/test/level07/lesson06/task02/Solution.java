package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        List<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++){
            String s = reader.readLine();
            list.add(s);
        }

        //Второй тип решения через второй лист
//        List<String> list2 = new ArrayList<String>();
//        int max=list.get(0).length();
//        for (int i = 0; i < list.size(); i++){
//            int k = list.get(i).length();
//            if (max < k){
//                max = k;
//                list2.set(0, list.get(i));
//            }else {
//                if (max == k){
//                    list2.add(list.get(i));
//                }
//            }
//        }
//        for (int i = 0; i < list2.size(); i++) {
//            System.out.println(list2.get(i));
//        }

        int max = list.get(0).length();
        for (int i = 0; i < list.size(); i++){
            int k = list.get(i).length();
            if (max < k){
                max = k;
            }
        }

        for (int i = 0; i < list.size(); i++){
            if (max == list.get(i).length()){
                System.out.println(list.get(i));
            }
        }

    }
}
