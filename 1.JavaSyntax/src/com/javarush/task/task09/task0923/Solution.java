package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] full = s.toCharArray();
        ArrayList<Character> vowel = new ArrayList<>();
        ArrayList<Character> notVowel = new ArrayList<>();

        for (Character c :
                full) {
            if (isVowel(c)) {
                vowel.add(c);
            } else {
                notVowel.add(c);
            }
        }

        for (Character c :
                vowel) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (Character c :
                notVowel) {
            if (!c.equals(' '))
                System.out.print(c + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}