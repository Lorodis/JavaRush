package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        String f2 = "";

        while (reader.ready()) {
            String[] f1 = reader.readLine().split(" ");

            for (String s :
                    f1) {
                if (s.matches(".*\\d.*")) f2 += s + " ";
            }
        }
        f2 = f2.substring(0, f2.length() - 1);
        writer.write(f2);

        reader.close();
        writer.close();
    }
}
