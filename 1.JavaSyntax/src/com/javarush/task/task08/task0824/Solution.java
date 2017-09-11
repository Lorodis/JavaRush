package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> ch = new ArrayList<>();
        Human c1 = new Human("c1", true, 15, ch);
        Human c2 = new Human("c2", false, 18, ch);
        Human c3 = new Human("c3", true, 22, ch);
        ArrayList<Human> children = new ArrayList<>();
        children.add(c1);
        children.add(c2);
        children.add(c3);
        Human f = new Human("f", true, 49, children);
        Human m = new Human("m", false, 47, children);
        ArrayList<Human> father = new ArrayList<>();
        ArrayList<Human> mother = new ArrayList<>();
        father.add(f);
        mother.add(m);
        Human gf1 = new Human("gf1", true, 69, father);
        Human gf2 = new Human("gf2", true, 71, mother);
        Human gm1 = new Human("gm1", false, 68, father);
        Human gm2 = new Human("gm2", false, 69, mother);

        System.out.println(gf1);
        System.out.println(gf2);
        System.out.println(gm1);
        System.out.println(gm2);
        System.out.println(f);
        System.out.println(m);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
