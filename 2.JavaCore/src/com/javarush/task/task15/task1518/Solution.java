package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static Cat cat;

    static {
        cat = new Cat();
        cat.name = "Awery";
        System.out.println(cat.name);
    }

    static class Cat {
        public String name;
    }

    public static void main(String[] args) {

    }
}
