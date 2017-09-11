package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        FileReader reader1 = new FileReader(fileName1);
        BufferedReader bufferedReader1 = new BufferedReader(reader1);
        FileReader reader2 = new FileReader(fileName2);
        BufferedReader bufferedReader2 = new BufferedReader(reader2);

        while (bufferedReader1.ready()) {
            list1.add(bufferedReader1.readLine());
        }
        while (bufferedReader2.ready()) {
            list2.add(bufferedReader2.readLine());
        }

        while (list1.size() > 0 && list2.size() > 0) {
            if (list1.get(0).equals(list2.get(0))) {
                lines.add(new LineItem(Type.SAME, (String) list1.get(0)));
                list1.remove(0);
                list2.remove(0);
            } else if (list1.get(0).equals(list2.get(1))) {
                lines.add(new LineItem(Type.ADDED, (String) list2.get(0)));
                list2.remove(0);
            } else if (list2.get(0).equals(list1.get(1))) {
                lines.add(new LineItem(Type.REMOVED, (String) list1.get(0)));
                list1.remove(0);
            }
        }
        if (list1.size() == 1) {
            lines.add(new LineItem(Type.REMOVED, (String) list1.get(0)));
            list1.remove(0);
        } else if (list2.size() == 1) {
            lines.add(new LineItem(Type.ADDED, (String) list2.get(0)));
            list2.remove(0);
        }
        reader1.close();
        reader2.close();
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
