package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> stringList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        while (fileReader.ready()) {
            sb.append(fileReader.readLine());
            sb.append(" ");
        }

        String[] sArr = sb.toString().split(" ");
        HashSet<Pair> set = new HashSet<>();
        for (int i = 0; i < sArr.length - 1; i++) {
            if (sArr[i] != null) {
                for (int j = i + 1; j < sArr.length; j++) {
                    if (sArr[j] != null) {
                        String s = new StringBuilder(sArr[j]).reverse().toString();
                        if (sArr[i].equals(s)) {
                            Pair pair = new Pair();
                            pair.first = sArr[i];
                            pair.second = sArr[j];
                            result.add(pair);
                            sArr[i] = null;
                            sArr[j] = null;
                            break;
                        }
                    }
                }
            }
        }
        for (Pair pair : result) {
            System.out.println(pair);
        }
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
