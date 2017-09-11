package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> div3 = new ArrayList<>();
        ArrayList<Integer> div2 = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            array.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                div2.add(array.get(i));
            }
            if (array.get(i) % 3 == 0) {
                div3.add(array.get(i));
            }
            if (array.get(i) % 2 != 0 && array.get(i) % 3 != 0) {
                other.add(array.get(i));
            }
        }

        printList(div3);
        printList(div2);
        printList(other);

    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer x :
                list) {
            System.out.println(x);
        }
    }
}
