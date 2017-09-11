package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String gfName = reader.readLine();
        String gmName = reader.readLine();
        String fName = reader.readLine();
        String mName = reader.readLine();
        String sName = reader.readLine();
        String dName = reader.readLine();

        Cat gf = new Cat(gfName);
        Cat gm = new Cat(gmName);
        Cat f = new Cat(fName, gf, null);
        Cat m = new Cat(mName, null, gm);
        Cat s = new Cat(sName, f, m);
        Cat d = new Cat(dName, f, m);

        System.out.println(gf);
        System.out.println(gm);
        System.out.println(f);
        System.out.println(m);
        System.out.println(s);
        System.out.println(d);
    }

    public static class Cat {
        private String name;
        private Cat f;
        private Cat m;

        Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat f, Cat m) {
            this.name = name;
            this.f = f;
            this.m = m;
        }

        @Override
        public String toString() {
            if (f == null & m == null)
                return "Cat name is " + name + ", no mother, no father";
            else if (f == null)
                return "Cat name is " + name + ", mother is " + m.name + ", no father";
            else if (m == null)
                return "Cat name is " + name + ", no mother, father is " + f.name;
            else
                return "Cat name is " + name + ", mother is " + m.name + " father is " + f.name;
        }
    }

}
