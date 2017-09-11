package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        int count = 0;
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

        while (fileReader.ready()) {
            String[] sArr = fileReader.readLine().split("\\W");
            for (String s :
                    sArr) {
                if (s.equals("world")) {
                    count++;
                }
            }
        }

        fileReader.close();
        System.out.println(count);
    }
}
