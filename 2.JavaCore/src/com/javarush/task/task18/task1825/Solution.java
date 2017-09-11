package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        String fullFileName = null;
        FileInputStream inputStream;
        FileOutputStream outputStream;
        TreeMap<Integer, byte[]> content = new TreeMap<>();

        while (!"end".equals(fileName = reader.readLine())) {
            int index = fileName.indexOf(".part");
            int partN = Integer.parseInt(fileName.substring(index + 5));
            fullFileName = fileName.substring(0, index);
            inputStream = new FileInputStream(fileName);
            byte[] buffer = new byte[inputStream.available()];

            inputStream.read(buffer);
            inputStream.close();
            content.put(partN, buffer);
        }

        for (Map.Entry pair :
                content.entrySet()) {
            outputStream = new FileOutputStream(fullFileName, true);
            outputStream.write((byte[]) pair.getValue());
            outputStream.close();
        }
    }
}
