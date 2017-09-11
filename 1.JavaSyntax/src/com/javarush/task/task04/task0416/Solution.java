package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double time = Double.parseDouble(reader.readLine());

        for (int i = 0; i < 60; i += 5) {
            if (time >= 0 + i && time < 3 + i) {
                System.out.println("зелёный");
            } else if (time >= 3 + i && time < 4 + i) {
                System.out.println("желтый");
            } else if (time >= 4 + i && time < 5 + i) {
                System.out.println("красный");
            }
        }
    }
}