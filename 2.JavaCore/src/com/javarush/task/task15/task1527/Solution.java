package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;/*
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        int begin = url.indexOf("?") + 1;
        String params = url.substring(begin);
        String[] keys = params.split("&");
        String objValue;

        String[] clearKeys = keys.clone();
        for (String s :
                clearKeys) {
            if (s.contains("=")) {
                int end = s.indexOf("=");
                s = s.substring(0, end);
            }
            System.out.print(s + " ");
        }
        System.out.println();


        for (String str :
                keys) {
            if (str.contains("obj=")) {
                objValue = str.substring(4);
                try {
                    alert(Double.parseDouble(objValue));
                } catch (Exception e) {
                    alert(objValue);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
