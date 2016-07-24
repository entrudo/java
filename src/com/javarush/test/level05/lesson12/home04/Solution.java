package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import javafx.scene.input.DataFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Date;
import java.text.DateFormat;


public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        //Locale local = new Locale("ru","RU");
        SimpleDateFormat dt = new SimpleDateFormat("dd MM YYYY");
        //Date data = new Date();
        //data.toString();
        //SimpleTimeFormat dat = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println(dt.format( new Date() ));
        //System.out.println("25 07 2016");
        /*SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM YYYY");
        System.out.println(dateFormat.format( new Date() ) );*/
    }
}
