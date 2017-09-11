package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        while (reader.ready()) {
            String[] line = reader.readLine().split(" ");
            int lineLength = line.length;
            int day = Integer.parseInt(line[lineLength - 3]);
            int month = Integer.parseInt(line[lineLength - 2]) - 1;
            int year = Integer.parseInt(line[lineLength - 1]);
            String name = "";
            Calendar calendar = new GregorianCalendar(year, month, day);

            for (int i = 0; i < lineLength - 3; i++) {
                name += line[i] + " ";
            }

            name = name.substring(0, name.length() - 1);
            PEOPLE.add(new Person(name, calendar.getTime()));
        }
        reader.close();

    }
}

