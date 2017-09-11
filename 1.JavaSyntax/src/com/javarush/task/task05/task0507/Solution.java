package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double result = 0;
        int count = 0;
        int i;
        while (true) {
            i = Integer.parseInt(reader.readLine());
            if (i == -1) {
                result = result / count;
                System.out.println(result);
                break;
            } else {
                result += i;
                count++;
            }
        }
    }
}

