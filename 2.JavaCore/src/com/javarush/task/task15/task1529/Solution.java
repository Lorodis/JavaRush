package com.javarush.task.task15.task1529;

/*
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Flyable result;

    public static void reset() throws IOException {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String type = reader.readLine();

        if ("helicopter".equals(type)) {
            result = new Helicopter();
        } else if ("plane".equals(type)) {
            int i = Integer.parseInt(reader.readLine());
            result = new Plane(i);
        }
    }
}
