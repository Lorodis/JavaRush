package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        String s = outputStream.toString().replaceAll("\\p{Cntrl}", "");
        String[] sArr = s.split(" ");
        int a = Integer.parseInt(sArr[0]);
        int b = Integer.parseInt(sArr[2]);
        int c = 0;
        switch (sArr[1]) {
            case "+" :
                c = a + b;
                break;
            case "-" :
                c = a - b;
                break;
            case "*" :
                c = a * b;
                break;
        }

        System.setOut(printStream);
        System.out.println(s + c);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

