package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> map = new HashMap<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;
            String city = reader.readLine();
            map.put(city, family);

        }

        String s = reader.readLine();

        for (Map.Entry<String, String> pair:
             map.entrySet()) {
            if (pair.getValue().equals(s))
                System.out.println(pair.getKey());
        }


        //list of addresses
//        List<String> addresses = new ArrayList<String>();
//        while (true) {
//            String family = reader.readLine();
//            if (family.isEmpty()) break;
//
//            addresses.add(family);
//        }

        //read home number
//        int houseNumber = Integer.parseInt(reader.readLine());
//
//        if (0 <= houseNumber && houseNumber < addresses.size()) {
//            String familySecondName = addresses.get(houseNumber);
//            System.out.println(familySecondName);
//        }
    }
}
