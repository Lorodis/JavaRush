package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();

        while (reader.ready()) {
            String[] line = reader.readLine().split(" ");
            String name = line[0];
            double value = Double.parseDouble(line[1]);

            if (map.containsKey(name)) {
                map.put(name, map.get(name) + value);
            } else {
                map.put(name, value);
            }
        }
        reader.close();

        for (Map.Entry<String, Double> pair :
                map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
