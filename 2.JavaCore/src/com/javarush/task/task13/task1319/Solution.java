package com.javarush.task.task13.task1319;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        String text;
        do {
            text = reader.readLine();
            writer.write(text + "\n");
            writer.flush();
        }
        while (!"exit".equals(text));
        writer.close();

    }
}
