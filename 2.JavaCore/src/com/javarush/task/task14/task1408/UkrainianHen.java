package com.javarush.task.task14.task1408;

class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 1000;
    }
    @Override
    String getDescription() {
        return String.format("Я - курица. Моя страна - %s. Я несу %s яиц в месяц.", Country.UKRAINE, getCountOfEggsPerMonth());
    }
}
