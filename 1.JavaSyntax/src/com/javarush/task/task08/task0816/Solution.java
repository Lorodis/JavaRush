package com.javarush.task.task08.task0816;

import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("MAY 1 1980"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("OCTOBER 1 1980"));
        map.put("Stallone5", new Date("JULY 1 1980"));
        map.put("Stallone6", new Date("DECEMBER 1 1980"));
        map.put("Stallone7", new Date("NOVEMBER 1 1980"));
        map.put("Stallone8", new Date("AUGUST 1 1980"));
        map.put("Stallone9", new Date("APRIL 1 1980"));
        map.put("Stallone10", new Date("JUNE 10 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        HashMap<String, Date> copy = new HashMap<>();
        for (Map.Entry<String, Date> pair :
                map.entrySet()) {
            String key = pair.getKey();
            Date d = pair.getValue();
            copy.put(key, d);
        }

        map.clear();
        for (Map.Entry<String, Date> pair :
                copy.entrySet()) {
            String key = pair.getKey();
            Date d = pair.getValue();
            if (d.getMonth() != 5 && d.getMonth() != 6 && d.getMonth() != 7) {
                map.put(key, d);
            }
        }

    }

    public static void main(String[] args) {

    }
}
