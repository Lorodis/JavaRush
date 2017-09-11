package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] list = new ArrayList[3];
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList1.add("JHAshdfjhf");
        arrayList1.add("JKHkjsdfags");
        arrayList2.add("zksjvlakjs");
        arrayList2.add("skdlhfjaksd");
        arrayList2.add("JKHdjsah");
        arrayList3.add("JHKjdksjakjsdf");
        arrayList3.add("Hsnndhjasj");
        arrayList3.add("sdfvasdfasdafdsdf");
        arrayList3.add("zsdfazs");
        list[0] = arrayList1;
        list[1] = arrayList2;
        list[2] = arrayList3;

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}