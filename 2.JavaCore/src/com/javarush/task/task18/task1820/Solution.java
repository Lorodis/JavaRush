package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String s = "";
        double result = 0;
        int rec = 0;

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        while (inputStream.available() > 0) {
            char c = (char) inputStream.read();
            if (!Character.isSpaceChar(c)) {
                s += c;
            } else {
                result = Double.parseDouble(s);
                rec = (int) Math.round(result);
                outputStream.write(Integer.toString(rec).getBytes());
                outputStream.write(' ');
                s = "";
                rec = 0;
            }
        }
        result = Double.parseDouble(s);
        rec = (int) Math.round(result);
        outputStream.write(Integer.toString(rec).getBytes());
        inputStream.close();
        outputStream.close();

    }
}
