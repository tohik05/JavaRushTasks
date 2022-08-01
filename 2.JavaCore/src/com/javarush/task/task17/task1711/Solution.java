package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));
        allPeople.add(Person.createMale("Петров Петр", new Date()));
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        Date bd = dateFormat1.parse(args[i + 2]);
                        if (args[i + 1].equals("м")) {
                            allPeople.add(Person.createMale(args[i], bd));
                            System.out.println(allPeople.size() - 1);
                        } else {
                            allPeople.add(Person.createFemale(args[i], bd));
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                    break;
                }
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        Date bd = dateFormat1.parse(args[i + 3]);
                        int id = Integer.parseInt(args[i]);
                        if (args[i + 2].equals("м")) {
                            allPeople.set(id, Person.createMale(args[i + 1], bd));
                        } else {
                            allPeople.set(id, Person.createFemale(args[i + 1], bd));
                        }
                    }
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person temp = allPeople.get(Integer.parseInt(args[i]));
                        temp.setName(null);
                        temp.setSex(null);
                        temp.setBirthDate(null);
                    }
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person temp = allPeople.get(Integer.parseInt(args[i]));
                        System.out.println(temp.getName() + " " + (temp.getSex() == Sex.MALE ? "м" : "ж") + " " + dateFormat2.format(temp.getBirthDate()));
                    }
                    break;
                }
        }
//тест вывода на экран
//        for (Person people : allPeople) {
//            System.out.println(people.getName() + " " + (people.getSex() == Sex.MALE ? "м" : "ж") + " " + dateFormat2.format(people.getBirthDate()));
//        }
    }
}
