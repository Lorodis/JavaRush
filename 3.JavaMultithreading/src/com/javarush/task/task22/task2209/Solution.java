package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //...
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder("");
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line + " ");
        }
        br.close();
        sb = getLine(sb.toString().split(" "));
        System.out.println(sb.toString());

    }

    public static StringBuilder getLine(String... words) {
        if (words == null || words.length == 0)
            return new StringBuilder();
        if ("".equals(words[0]) || words.length == 1)
            return new StringBuilder(words[0]);


        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (words != null) {
            Arrays.sort(words);
            sb.append(words[0]);
            for (int i = 0; i < words.length - 1; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].substring(words[i].length() - 1).equals(words[j].substring(0, 1).toLowerCase())) {
                        sb.append(" " + words[j]);
                    }
                }
            }

            String[] arr = sb.toString().split(" ");

            HashSet<String> set = new HashSet<>();
            for (String s :
                    arr) {
                set.add(s);
            }

            for (String s :
                    words) {
                if (!set.contains(s)) {
                    sb.append(" " + s);
                }
            }


        }

        return sb.append(sb2);
    }
}
