package com.javarush.task.pro.task14.task1415;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        storage.add(0,s);
    }

    public String pop() {
        return storage.remove(0);
    }

    public String peek() {
        return storage.get(0);
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public int search(String s) {
        if (true) {
            return storage.indexOf(s);
        }else
            return -1;
    }
}
