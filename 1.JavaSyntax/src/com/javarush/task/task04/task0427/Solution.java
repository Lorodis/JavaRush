package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        String isEven, digits;

        if (a > 0 && a < 1000) {
            if (a % 2 == 0) {
                isEven = "четное";
            } else {
                isEven = "нечетное";
            }
            if ( a / 100 > 0) {
                digits = "трехзначное";
            } else if (a / 10 > 0) {
                digits = "двузначное";
            } else {
                digits = "однозначное";
            }
            System.out.println(isEven + " " + digits + " число");
        }

    }
}
