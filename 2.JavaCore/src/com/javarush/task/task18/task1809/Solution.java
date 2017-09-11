package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fName1 = reader.readLine();
        String fName2 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fName1);
        FileOutputStream outputStream = new FileOutputStream(fName2);

        byte[] buffer = new byte[inputStream.available()];
        while (inputStream.available() > 0) {
            inputStream.read(buffer);

            byte[] rev = new byte[buffer.length];
            for (int i = 0; i < buffer.length; i++) {
                rev[buffer.length - i - 1] = buffer[i];
            }

            outputStream.write(rev);
        }

        inputStream.close();
        outputStream.close();
    }
}
