package com.javarush.task.task34.task3408;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;

public class Cache<K, V> {
    private Map<K, V> cache = new WeakHashMap<>();   //TODO add your code here

    public V getByKey(K key, Class<V> clazz) throws Exception {
        Constructor<V> constructor = clazz.getConstructor(key.getClass());
        V value = constructor.newInstance(key);
        System.out.println(constructor);
        if (!cache.containsKey(key)) {
            cache.put(key, value);
        }
        return cache.get(key);
    }

    public boolean put(V obj) {
        try {
            Method getKey = obj.getClass().getDeclaredMethod("getKey");
            getKey.setAccessible(true);
            K key = (K) getKey.invoke(obj);
            cache.put(key, obj);
            return true;
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException ignored) {
        }
        return false;
    }

    public int size() {
        return cache.size();
    }

}
