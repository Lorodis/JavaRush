package com.javarush.task.task07.task0705;

/*
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArray = new int[20];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < 20; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 10; i++) {
            arr1[i] = bigArray[i];
        }

        for (int i = 0; i < 10; i++) {
            arr2[i] = bigArray[i + 10];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr2[i]);
        }

    }
}
