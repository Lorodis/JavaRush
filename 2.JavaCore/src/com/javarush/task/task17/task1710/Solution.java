package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        if (args[0].equals("-c")) {
            if (args[2].equals("м")) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                allPeople.add(Person.createMale(args[1], sdf.parse(args[3])));
                System.out.println(allPeople.size() - 1);
            } else if (args[2].equals("ж")) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                allPeople.add(Person.createFemale(args[1], sdf.parse(args[3])));
                System.out.println(allPeople.size() - 1);
            }
        } else if (args[0].equals("-u")) {
            allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(sdf.parse(args[4]));
            if (args[3].equals("м")) {
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
            } else if (args[3].equals("ж")) {
                allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
            }
            allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
        } else if (args[0].equals("-d")) {
            allPeople.get(Integer.parseInt(args[1])).setName(null);
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(null);
        } else if (args[0].equals("-i")) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyy", Locale.ENGLISH);
            Person person = allPeople.get(Integer.parseInt(args[1]));
            String name = person.getName();
            String sex;
            String bd = sdf.format(person.getBirthDay());

            if (person.getSex() == Sex.MALE)
                sex = "м";
            else
                sex = "ж";

            String info = name + " " + sex + " " + bd;
            System.out.println(info);
        }
    }
}
