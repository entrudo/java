package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(30.2, "One");
        labels.put(31.3, "Two");
        labels.put(32.4, "Three");
        labels.put(33.5, "Four");
        labels.put(34.6, "Five");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
