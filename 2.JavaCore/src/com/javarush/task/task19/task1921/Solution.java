package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            String line;
            String tmpDate = null;
            String tmpName = "";
            while ((line = reader.readLine()) != null){
                Pattern birth = Pattern.compile("\\d+[\\s]\\d+[\\s]\\d+");
                Matcher mBirth = birth.matcher(line);
                while (mBirth.find()){
                    tmpDate = mBirth.group();
                }
                String[] splitBirth = tmpDate.split(" ");
                Calendar cal = new GregorianCalendar(Integer.parseInt(splitBirth[2]), Integer.parseInt(splitBirth[1]) -1, Integer.parseInt(splitBirth[0]));
                Pattern name = Pattern.compile("\\D");
                Matcher mName = name.matcher(line);
                while (mName.find()) {
                    tmpName += mName.group();
                }
                PEOPLE.add(new Person(tmpName.trim(), cal.getTime()));
                tmpName = "";
            }
        }
    }
}
//C:\Users\Тоха\Desktop\testjava.txt