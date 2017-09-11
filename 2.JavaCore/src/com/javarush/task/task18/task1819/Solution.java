package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file1);
        byte[] buffer = new byte[inputStream.available()];
        inputStream.read(buffer);
        inputStream.close();

        inputStream = new FileInputStream(file2);
        FileOutputStream outputStream = new FileOutputStream(file1);
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            outputStream.write(data);
        }

        outputStream.close();
        inputStream.close();

        outputStream = new FileOutputStream(file1, true);
        outputStream.write(buffer);
        outputStream.close();

    }
}
