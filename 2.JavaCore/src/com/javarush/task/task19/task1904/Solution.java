package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String temp = fileScanner.nextLine();
            String[] fio = temp.split(" ");
            Calendar calendar = new GregorianCalendar(Integer.parseInt(fio[5]), Integer.parseInt(fio[4]) - 1, Integer.parseInt(fio[3]));
            Date date = calendar.getTime();
            return new Person(fio[1], fio[2], fio[0], date);
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
