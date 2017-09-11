package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Fam1", "Nam1");
        map.put("Fam2", "Nam1");
        map.put("Fam3", "Nam2");
        map.put("Fam4", "Nam2");
        map.put("Fam5", "Nam3");
        map.put("Fam6", "Nam4");
        map.put("Fam7", "Nam4");
        map.put("Fam8", "Nam5");
        map.put("Fam9", "Nam5");
        map.put("Fam10", "Nam5");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        for (String s : new HashSet<>(map.values())) {
            int count = 0;
            for (String name : map.values()) if (name.equals(s)) count++;
            if (count > 1) removeItemFromMapByValue(map, s);
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
    }
}
