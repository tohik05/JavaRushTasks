package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null || telNumber.equals("")){
            return false;
        }
        if (telNumber.length() == 15){
            System.out.println("Yslovie iz 15 simvolov");
            if (telNumber.startsWith("+")){
                Pattern p = Pattern.compile("\\d{0,8}\\(\\d{3}\\)\\d{1,9}$");
                Matcher m = p.matcher(telNumber);
                while (m.find()){
                    return true;
                }
            }
        }
        if (telNumber.length() == 13){
            System.out.println("Yslovie iz 13 simvolov");
            Pattern p = Pattern.compile("^\\+\\d{12}");
            Matcher m = p.matcher(telNumber);
            while (m.find()){
                return true;
            }
        }
        if (telNumber.length() == 12){
            System.out.println("Yslovie iz 12 simvolov");
            if (telNumber.startsWith("(")){
                Pattern p = Pattern.compile("\\(\\d{3}\\)\\d{7}");
                Matcher m = p.matcher(telNumber);
                while (m.find()){
                    return true;
                }
            }else {
                Pattern p = Pattern.compile("\\d{1,6}\\(\\d{3}\\)\\d{1,6}$");
                Matcher m = p.matcher(telNumber);
                while (m.find()){
                    return true;
                }
            }
        }
        if (telNumber.length() == 10){
            System.out.println("Yslovie iz 10 simvolov");
            Pattern p = Pattern.compile("\\d{10}");
            Matcher m = p.matcher(telNumber);
            while (m.find()){
                return true;
            }
        }
        System.out.println("Ne sootvetstvyet ysloviyam");
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkTelNumber("+380501234567"));//if lenth13
        System.out.println(checkTelNumber("+38(050)1234567"));//if lenth13
        System.out.println(checkTelNumber("(050)1234567"));//if lenth15
        System.out.println(checkTelNumber("0(501)234567"));//if lenth15
        System.out.println(checkTelNumber("+7(499)80501234"));//if lenth15
        System.out.println(checkTelNumber("+237(499)501234"));//if lenth12

        System.out.println(checkTelNumber("+38)050(1234567 "));//if lenth12
        System.out.println(checkTelNumber("+38(050)123-45-67"));//if lenth12
        System.out.println(checkTelNumber("050ххх4567 "));//if lenth12
        System.out.println(checkTelNumber("050123456"));//if lenth12
        System.out.println(checkTelNumber("(0)501234567"));//if lenth10
        System.out.println(checkTelNumber("0501234567"));//if lenth10
        System.out.println(checkTelNumber(null));//if null
    }
}
