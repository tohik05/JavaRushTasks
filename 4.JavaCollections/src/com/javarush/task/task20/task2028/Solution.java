package com.javarush.task.task20.task2028;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> list = new CustomTree();

        for (int i = 1; i < 16; i++) {
            list.add(String.valueOf(i));
        }

        System.out.println("The list size at start is " + list.size());
        System.out.println("The expected parent is 3. The actual parent is " + ((CustomTree) list).getParent("8"));
        System.out.println("The expected parent is null. The actual parent is " + ((CustomTree) list).getParent("20"));

        System.out.println("all tree:");
        ((CustomTree) list).printTree();
        list.remove("3");

        System.out.println("After delete 3(7/8/15), the expected size is 11, but we have is " + list.size());
        ((CustomTree) list).printTree();

        System.out.println("The expected parent is null. The actual parent is " + ((CustomTree) list).getParent("8"));
        list.add("16");
        System.out.println("The expected parent is 9. The actual parent is " + ((CustomTree) list).getParent("16"));

        System.out.println("After add 16 to list our all tree:");
        ((CustomTree) list).printTree();

        System.out.println("The expected size is 12, but we have is " + list.size());
        System.out.println("The expected parent is 9. The actual parent is " + ((CustomTree) list).getParent("16"));

        list.remove("4");

        System.out.println("After delete 4(9/10/16), the expected size is 8, but we have is " + list.size());
        ((CustomTree) list).printTree();

        list.remove("5");

        System.out.println("After delete 5(11/12), the expected size is 5, but we have is " + list.size());
        ((CustomTree) list).printTree();

        list.remove("6");

        System.out.println("After delete 6(13/14), the expected size is 2, but we have is " + list.size());
        ((CustomTree) list).printTree();

        System.out.println("Expected: true. Actual: " + list.add("20"));
        System.out.println("The expected parent is 1. The actual parent is " + ((CustomTree) list).getParent("20"));
    }
}
