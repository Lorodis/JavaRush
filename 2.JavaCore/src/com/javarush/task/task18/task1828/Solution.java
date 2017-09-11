package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> list = new ArrayList<>();
        while (fileReader.ready()) {
            list.add(fileReader.readLine());
        }
        fileReader.close();

        if ("-u".equals(args[0])) {
            for (int i = 0; i < list.size(); i++) {
                int index = Integer.parseInt(list.get(i).substring(0, 8).trim());
                if (Integer.parseInt(args[1]) == index) {
                    list.remove(i);
                    list.add(i, String.format("%-8s%-30s%-8s%-4s", args[1], args[2], args[3], args[4]));
                    break;
                }
            }

        } else if ("-d".equals(args[0])) {
            for (int i = 0; i < list.size(); i++) {
                int index = Integer.parseInt(list.get(i).substring(0, 8).trim());
                if (Integer.parseInt(args[1]) == index) {
                    list.remove(i);
                    break;
                }
            }
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (String s :
                list) {
            writer.write(s + "\n");
        }
        writer.close();
    }
}
