package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        Charset win1251 = Charset.forName("Windows-1251");
        Charset utf8 = Charset.forName("UTF-8");

        FileInputStream fr = new FileInputStream(args[0]);
        FileOutputStream fw = new FileOutputStream(args[1]);

        byte[] buffer = new byte[fr.available()];
        while (fr.available() > 0) {
            fr.read(buffer);
        }
        String s = new String(buffer, utf8);
        buffer = s.getBytes(win1251);

        fw.write(buffer);
    }
}
