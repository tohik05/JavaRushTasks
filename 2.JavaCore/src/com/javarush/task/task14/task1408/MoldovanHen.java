package com.javarush.task.task14.task1408;

class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 300;
    }
    @Override
    String getDescription() {
        return String.format("Я - курица. Моя страна - %s. Я несу %s яиц в месяц.", Country.MOLDOVA, getCountOfEggsPerMonth());
    }
}
