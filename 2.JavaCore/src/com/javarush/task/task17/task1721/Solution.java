package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = null;
        String secondFileName = null;
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(firstFileName));
            while ((fileReader.ready())) {
                allLines.add(fileReader.readLine());
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(secondFileName));
            while ((fileReader.ready())) {
                forRemoveLines.add(fileReader.readLine());
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
