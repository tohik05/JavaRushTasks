package com.javarush.task.task36.task3602;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Найти класс по описанию Ӏ Java Collections: 6 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class getExpectedClass() {
        for (Class tmp : Collections.class.getDeclaredClasses()) {
            if (List.class.isAssignableFrom(tmp) && Modifier.isPrivate(tmp.getModifiers()) && Modifier.isStatic(tmp.getModifiers())) {
                try {
                    Constructor constructor = tmp.getDeclaredConstructor();
                    constructor.setAccessible(true);
                    constructor.newInstance(new ArrayList<>().get(0));
                } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException ignore) {
                } catch (IndexOutOfBoundsException e) {
                    return tmp;
                }
            }
        }
        return null;
    }
}
