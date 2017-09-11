package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2], true);
        int firstHalf;
        int secondHalf;
        byte[] buffer1 = null;
        byte[] buffer2 = null;

        if (inputStream.available() % 2 == 0) {
            firstHalf = inputStream.available() / 2;
            secondHalf = firstHalf;
        } else {
            firstHalf = inputStream.available() / 2;
            secondHalf = inputStream.available() - firstHalf;
        }


        if ("-e".equals(args[0])) {
            buffer1 = new byte[firstHalf];
            buffer2 = new byte[secondHalf];
        } else if ("-d".equals(args[0])) {
            buffer1 = new byte[secondHalf];
            buffer2 = new byte[firstHalf];

        }
        inputStream.read(buffer1);
        inputStream.read(buffer2);
        outputStream.write(buffer2);
        outputStream.write(buffer1);

        inputStream.close();
        outputStream.close();
    }

}
