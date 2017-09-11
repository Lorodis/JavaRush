package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        HashMap<String, Double> map = new HashMap<>();
        double max = 0;
        ArrayList<String> maxKeys = new ArrayList<>();

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
            if (pair.getValue() > max) {
                max = pair.getValue();
            }
        }

        for (Map.Entry<String, Double> pair :
                map.entrySet()) {
            if (max == pair.getValue()) {
                maxKeys.add(pair.getKey());
            }
        }

        for (String s :
                maxKeys) {
            System.out.println(s);
        }
    }
}
