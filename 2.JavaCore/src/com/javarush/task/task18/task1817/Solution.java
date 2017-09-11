package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        int allCount = 0;
        int spaceCount = 0;
        FileInputStream inputStream = new FileInputStream(args[0]);

        while (inputStream.available() > 0) {
            allCount++;
            char c = (char) inputStream.read();
            if (Character.isSpaceChar(c)) {
                spaceCount++;
            }
        }
        inputStream.close();
        float f = (float) spaceCount / allCount * 100;
        System.out.println(String.format("%.2f", f));
    }
}
