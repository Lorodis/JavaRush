package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String firstName;
        private String midName;
        private String lastName;
        private int age;
        private boolean sex;
        private int childrenCount;

        public Human(String firstName) {
            this.firstName = firstName;
        }

        public Human(String firstName, String midName) {
            this.firstName = firstName;
            this.midName = midName;
        }

        public Human(String firstName, String midName, String lastName) {
            this.firstName = firstName;
            this.midName = midName;
            this.lastName = lastName;
        }

        public Human(String firstName, int age) {
            this.firstName = firstName;
            this.age = age;
        }

        public Human(String firstName, String midName, int age) {
            this.firstName = firstName;
            this.midName = midName;
            this.age = age;
        }

        public Human(String firstName, String midName, String lastName, int age) {
            this.firstName = firstName;
            this.midName = midName;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String firstName, int age, boolean sex) {
            this.firstName = firstName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String firstName, String midName, int age, boolean sex) {
            this.firstName = firstName;
            this.midName = midName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String firstName, String midName, String lastName, int age, boolean sex) {
            this.firstName = firstName;
            this.midName = midName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String firstName, String midName, String lastName, int age, boolean sex, int childrenCount) {
            this.firstName = firstName;
            this.midName = midName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.childrenCount = childrenCount;
        }
    }
}
