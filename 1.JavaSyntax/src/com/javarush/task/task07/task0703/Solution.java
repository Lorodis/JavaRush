package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] sArray = new String[10];
        int[] nArray = new int[10];

        for (int i = 0; i < 10; i++) {
            sArray[i] = reader.readLine();
            nArray[i] = sArray[i].length();
        }

        for (int i = 0; i < nArray.length; i++) {
            System.out.println(nArray[i]);
        }
    }
}
