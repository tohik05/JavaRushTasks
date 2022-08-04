package com.javarush.task.task35.task3505;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertableUtil {

    public static <Key, V extends Convertable<Key>> Map<Key, V> convert(List<V> list) {
        Map<Key, V> result = new HashMap<>();
        for (V element : list) {
            result.put(element.getKey(), element);
        }
        return result;
    }
}
