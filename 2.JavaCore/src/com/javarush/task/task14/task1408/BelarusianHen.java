package com.javarush.task.task14.task1408;

class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 500;
    }
    @Override
    String getDescription() {
        return String.format("Я - курица. Моя страна - %s. Я несу %s яиц в месяц.", Country.BELARUS, getCountOfEggsPerMonth());
    }
}
