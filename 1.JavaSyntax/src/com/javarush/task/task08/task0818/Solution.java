package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 300);
        map.put("d", 400);
        map.put("e", 500);
        map.put("f", 600);
        map.put("g", 700);
        map.put("h", 800);
        map.put("i", 900);
        map.put("j", 999);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair:
             copy.entrySet()) {
            int i = pair.getValue();
            String s = pair.getKey();
            if (i < 500) {
                map.remove(s);
            }
        }
    }

    public static void main(String[] args) {

    }
}