package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<Integer> set = new HashSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            set.add(data);
        }

        fileInputStream.close();

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(set);
        Collections.sort(list);

        for (Integer i :
                list) {
            System.out.print(i + " ");
        }

    }
}
