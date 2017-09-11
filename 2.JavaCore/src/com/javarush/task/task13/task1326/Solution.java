package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        ArrayList<Integer> list = new ArrayList<>();

        while (fileReader.ready()) {
            int data = Integer.parseInt(fileReader.readLine());
            if (data % 2 == 0) {
                list.add(data);
            }
        }
        fileReader.close();

        Collections.sort(list);

        for (Integer i :
                list) {
            System.out.println(i);
        }
    }
}
