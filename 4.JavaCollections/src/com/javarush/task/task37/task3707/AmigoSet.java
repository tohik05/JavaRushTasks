package com.javarush.task.task37.task3707;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class AmigoSet<E> extends AbstractSet<E> implements Serializable, Cloneable, Set<E> {

    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map;

    public AmigoSet(Collection<? extends E> collection) {
        map = new HashMap<>(Math.max((int) (collection.size() / .75f) + 1, 16));
        addAll(collection);
    }

    public AmigoSet() {
        map = new HashMap<>();
    }

    @Override
    public boolean add(E e) {
        if (map.containsKey(e)) return false;
        map.put(e, PRESENT);
        return true;
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) == PRESENT;
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public Object clone() throws InternalError {
        try {
            AmigoSet<E> cloneSet = (AmigoSet<E>) super.clone();
            cloneSet.map = (HashMap<E, Object>) this.map.clone();
            return cloneSet;
        } catch (Exception e) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOut) {
        try {
            objectOut.defaultWriteObject();
            objectOut.writeInt(HashMapReflectionHelper.callHiddenMethod(map, "capacity"));
            objectOut.writeFloat(HashMapReflectionHelper.callHiddenMethod(map, "loadFactor"));
            objectOut.writeInt(map.size());
            for (E e : map.keySet()) {
                objectOut.writeObject(e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream objectIn) {
        try {
            objectIn.defaultReadObject();
            int capacity = objectIn.readInt();
            float loadFactor = objectIn.readFloat();
            int size = objectIn.readInt();
            map = new HashMap<>(capacity, loadFactor);
            for (int i = 0; i < size; i++) {
                E e = (E) objectIn.readObject();
                map.put(e, PRESENT);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
