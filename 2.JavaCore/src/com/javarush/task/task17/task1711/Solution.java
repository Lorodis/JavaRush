package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        int argsLength = args.length - 1;
        switch (args[0]) {
            case ("-c"): {
                synchronized (allPeople) {
                    for (int i = 0; i < argsLength; i += 3) {
                        if (args[2 + i].equals("м")) {
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                            allPeople.add(Person.createMale(args[1 + i], sdf.parse(args[3 + i])));
                            System.out.println(allPeople.size() - 1);
                        } else if (args[2 + i].equals("ж")) {
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                            allPeople.add(Person.createFemale(args[1 + i], sdf.parse(args[3 + i])));
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                    break;
                }
            }
            case ("-u"): {
                synchronized (allPeople) {
                    for (int i = 0; i < argsLength; i += 4) {
                        allPeople.get(Integer.parseInt(args[1 + i])).setName(args[2 + i]);
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        allPeople.get(Integer.parseInt(args[1 + i])).setBirthDay(sdf.parse(args[4 + i]));
                        if (args[3 + i].equals("м")) {
                            allPeople.get(Integer.parseInt(args[1 + i])).setSex(Sex.MALE);
                        } else if (args[3 + i].equals("ж")) {
                            allPeople.get(Integer.parseInt(args[1 + i])).setSex(Sex.FEMALE);
                        }
                        allPeople.get(Integer.parseInt(args[1 + i])).setName(args[2 + i]);
                    }
                    break;
                }
            }
            case ("-d"): {
                synchronized (allPeople) {
                    for (int i = 0; i < argsLength; i++) {
                        allPeople.get(Integer.parseInt(args[1 + i])).setName(null);
                        allPeople.get(Integer.parseInt(args[1 + i])).setSex(null);
                        allPeople.get(Integer.parseInt(args[1 + i])).setBirthDay(null);
                    }
                    break;
                }
            }
            case ("-i"): {
                synchronized (allPeople) {
                    for (int i = 0; i < argsLength; i++) {
                        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyy", Locale.ENGLISH);
                        Person person = allPeople.get(Integer.parseInt(args[1 + i]));
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
                    break;
                }
            }


        }
    }
}
