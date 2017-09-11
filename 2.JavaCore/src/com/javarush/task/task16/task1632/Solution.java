package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Thread1 thread1 = new Thread1();
        threads.add(thread1);
        Thread2 thread2 = new Thread2();
        threads.add(thread2);
        Thread3 thread3 = new Thread3();
        threads.add(thread3);
        Thread4 thread4 = new Thread4();
        threads.add(thread4);
        Thread5 thread5 = new Thread5();
        threads.add(thread5);
    }

    public static void main(String[] args) {
    }
}

class Thread1 extends Thread {
    public void run() {
        while (true) {
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        try {
            throw new InterruptedException();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}

class Thread3 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Ура");
                sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread4 extends Thread implements Message {
    public void run() {
    }

    @Override
    public void showWarning() {
        interrupt();
    }
}

class Thread5 extends Thread {
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int sum = 0;
        try {
            while (!("N".equals(s = reader.readLine()))) {
                sum += Integer.parseInt(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }
}