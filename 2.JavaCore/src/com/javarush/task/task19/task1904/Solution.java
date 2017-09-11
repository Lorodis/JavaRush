package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            Person person = null;
            if (fileScanner.hasNext()) {
                String[] personArr = this.fileScanner.nextLine().split(" ");
                String lastName = personArr[0];
                String firstName = personArr[1];
                String middleName = personArr[2];
                Calendar calendar = new GregorianCalendar(Integer.parseInt(personArr[5]), Integer.parseInt(personArr[4]) - 1, Integer.parseInt(personArr[3]));
                return new Person(firstName, middleName, lastName, calendar.getTime());
            }
            return person;
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
