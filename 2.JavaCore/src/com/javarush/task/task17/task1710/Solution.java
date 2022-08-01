package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));
        allPeople.add(Person.createMale("Петров Петр", new Date()));
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        if (args[0].equals("-c")) {
            Date bd = dateFormat1.parse(args[3]);
            if (args[2].equals("м")) {
                allPeople.add(Person.createMale(args[1], bd));
                System.out.println(allPeople.size() - 1);
            } else {
                allPeople.add(Person.createFemale(args[1], bd));
                System.out.println(allPeople.size() - 1);
            }
        } else if (args[0].equals("-r")) {
            Person result = allPeople.get(Integer.parseInt(args[1]));
            System.out.println(result.getName() + " " + (result.getSex() == Sex.MALE ? "м" : "ж") + " " + dateFormat2.format(result.getBirthDate()));
        } else if (args[0].equals("-u")) {
            Date bd = dateFormat1.parse(args[4]);
            if (args[3].equals("м")) {
                allPeople.set(Integer.parseInt(args[1]), Person.createMale(args[2], bd));
            } else {
                allPeople.set(Integer.parseInt(args[1]), Person.createFemale(args[2], bd));
            }
        } else if (args[0].equals("-d")) {
            Person temp = allPeople.get(Integer.parseInt(args[1]));
            temp.setName(null);
            temp.setSex(null);
            temp.setBirthDate(null);
        }
    }
}
