package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("asd", "qwe");
        map.put("asd", "asd");
        map.put("qwe", "zxc");
        map.put("zxc", "wer");
        map.put("zc", "wer");
        map.put("zxc", "wer");
        map.put("rfv", "sdf");
        map.put("tgb", "xcv");
        map.put("qdt", "ert");
        map.put("zdr", "ert");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
