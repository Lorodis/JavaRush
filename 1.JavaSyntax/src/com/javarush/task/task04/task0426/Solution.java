package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        String isPositive, isEven;
        if (a == 0) {
            System.out.println("ноль");
        } else {
            if (a > 0) {
                isPositive = "положительное";
            } else {
                isPositive = "отрицательное";
            }
            if (a % 2 == 0) {
                isEven = "четное";
            } else {
                isEven = "нечетное";
            }
            System.out.println(isPositive + " " + isEven + " число");
        }
    }
}
