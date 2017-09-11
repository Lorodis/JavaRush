package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Самые-самые
*/
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int max = list.get(0).length();
        int min = list.get(0).length();
        int minPos = 0;
        int maxPos = 0;

        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i).length())
                max = list.get(i).length();
            if (min > list.get(i).length())
                min = list.get(i).length();
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == min) {
                minPos = i;
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == max) {
                maxPos = i;
                break;
            }
        }

        if (minPos <= maxPos)
            System.out.println(list.get(minPos));
        else
            System.out.println(list.get(maxPos));
    }
}
