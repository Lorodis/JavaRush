package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        while (reader.ready()) {
            char[] arr = reader.readLine().toCharArray();
            String result = "";

            for (int i = 0; i < arr.length; i++) {
                result += arr[arr.length - 1 - i];
            }

            System.out.println(result);
        }

        reader.close();
    }
}
