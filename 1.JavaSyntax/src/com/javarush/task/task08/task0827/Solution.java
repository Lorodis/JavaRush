package com.javarush.task.task08.task0827;

/*
Работа с датой
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        Date d = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH).parse(date);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(d);
        int day = calendar.get(Calendar.DAY_OF_YEAR);
        if (day % 2 != 0)
            return true;
        else
            return false;
    }
}
