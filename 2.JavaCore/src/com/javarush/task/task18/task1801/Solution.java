package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;/*
Максимальный байт
*/
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int max = 0;

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            if (data > max) max = data;
        }
        fileInputStream.close();

        System.out.println(max);
    }
}
