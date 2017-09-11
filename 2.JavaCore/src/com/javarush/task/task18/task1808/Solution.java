package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream1 = new FileOutputStream(fileName2);
        FileOutputStream outputStream2 = new FileOutputStream(fileName3);

        int size1;
        if (inputStream.available() % 2 != 0) {
            size1 = inputStream.available() / 2 + 1;
        } else {
            size1 = inputStream.available() / 2;
        }
        int size2 = inputStream.available() - size1;

        byte[] buffer1 = new byte[size1];
        byte[] buffer2 = new byte[size2];
        while (inputStream.available() > 0) {
            inputStream.read(buffer1);
            outputStream1.write(buffer1, 0, size1);
            inputStream.read(buffer2);
            outputStream2.write(buffer2, 0, size2);
        }

        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
