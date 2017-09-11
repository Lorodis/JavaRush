package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String result = "";
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        for (String spl:
             s.split("\\b")) {
           result += spl.substring(0, 1).toUpperCase() + spl.substring(1);
        }
        System.out.println(result);
    }
}
