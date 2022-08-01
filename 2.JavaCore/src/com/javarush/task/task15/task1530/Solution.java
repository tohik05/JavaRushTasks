package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        DrinkMaker tea = new TeaMaker();
        DrinkMaker latte = new LatteMaker();
        System.out.println("Рецепт приготовления чая");
        tea.makeDrink();
        System.out.println("-------------------------");
        System.out.println("Рецепт приготовления латте");
        latte.makeDrink();
    }
}
