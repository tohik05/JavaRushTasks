package com.javarush.task.task37.task3702;

import com.javarush.task.task37.task3702.female.FemaleFactory;
import com.javarush.task.task37.task3702.male.MaleFactory;

public class FactoryProducer {
    public enum HumanFactoryType {
        MALE,
        FEMALE
    }

    public static AbstractFactory getFactory(HumanFactoryType sex) {
        if (sex == HumanFactoryType.FEMALE) {
            return new FemaleFactory();
        }
        return new MaleFactory();
    }
}
