package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        int max = 0;

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> list = new ArrayList<>();
        while (fileReader.ready()) {
            list.add(fileReader.readLine());
        }
        fileReader.close();

        for (String s :
                list) {
            int index = Integer.parseInt(s.substring(0, 8).trim());
            if (index > max) {
                max = index;
            }
        }

        if ("-c".equals(args[0])) {
            list.add(String.format("%-8d%-30s%-8s%-4s", ++max, args[1], args[2], args[3]));
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (String s :
                list) {
            writer.write(s + "\n");
        }
        writer.close();
    }
}
