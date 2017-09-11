package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        HashMap<Integer, Integer> map = new HashMap<>();

        FileInputStream fileInputStream = new FileInputStream(filename);
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            if (map.containsKey(data)) {
                map.put(data, map.get(data) + 1);
            } else {
                map.put(data, 1);
            }
        }

        int min = 255;

        for (Map.Entry pair :
                map.entrySet()) {
            if ((int) pair.getValue() < min) min = (int) pair.getValue();
        }

        for (Map.Entry pair :
                map.entrySet()) {
            if (pair.getValue().equals(min)) {
                System.out.print(pair.getKey() + " ");
            }
        }

        fileInputStream.close();
    }
}
