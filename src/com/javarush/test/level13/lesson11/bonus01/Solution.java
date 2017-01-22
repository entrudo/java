package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    BufferedReader readerFile = new BufferedReader(new FileReader(reader.readLine()));
	    
	    int[] array = new int[3];
	    int count = 0;
	    String temp;
	    
	    while ((temp = readerFile.readLine()) != null){
	    	if (Integer.parseInt(temp) % 2 == 0){
			    array[count] = Integer.parseInt(temp);
			    count++;
	    	}
	    }
	
	    Arrays.sort(array);
	    
	    for (int i : array){
		    System.out.println(i);
	    }
	    
	    
    }
}
