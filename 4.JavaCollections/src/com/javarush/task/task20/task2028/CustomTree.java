package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.*;

/* 
Построй дерево(1)
*/

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {

    Entry<String> root;
    ArrayList<Entry<String>> treeElements = new ArrayList<>();

    public CustomTree() {
        this.root = new Entry<>("0");
        treeElements.add(root);
    }

    static class Entry<T> implements Serializable {
        String elementName;
        boolean availableToAddLeftChildren = true;
        boolean availableToAddRightChildren = true;
        Entry<T> parent;
        Entry<T> leftChild;
        Entry<T> rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
        }

        public boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }

        @Override
        public String toString() {
            return "" + elementName;
        }
//        @Override
//        public String toString() {
//            return "Entry{" +
//                    "elementName='" + elementName + '\'' +
//                    ", leftChild=" + leftChild +
//                    ", rightChild=" + rightChild +
//                    '}';
//        }
    }

    @Override
    public int size() {
        return treeElements.size() - 1;
    }

    @Override
    public boolean add(String elementToAdd) {
        Entry<String> newElement = new Entry<>(elementToAdd);
        for (Entry<String> element : treeElements) {
            if (element.isAvailableToAddChildren()) {
                newElement.parent = element;
                if (element.availableToAddLeftChildren) {
                    element.leftChild = newElement;
                    element.availableToAddLeftChildren = false;
                } else {
                    element.rightChild = newElement;
                    element.availableToAddRightChildren = false;
                }
                treeElements.add(newElement);
                return true;
            }
        }
        goingToHaveChildren();
        return add(elementToAdd);
    }

    @Override
    public boolean remove(Object elementToRemove) {
        if (!(elementToRemove instanceof String)) throw new UnsupportedOperationException();

        for (Entry<String> element : treeElements) {
            if (element.elementName.equals(elementToRemove)) {
                if (element.leftChild != null) {
                    remove(element.leftChild.elementName);
                }
                if (element.rightChild != null) {
                    remove(element.rightChild.elementName);
                }

                if (element.parent.leftChild == element) {
                    treeElements.remove(element.parent.leftChild);
                    element.parent.leftChild = null;
                    element.parent.availableToAddLeftChildren = true;
                }
                if (element.parent.rightChild == element) {
                    treeElements.remove(element.parent.rightChild);
                    element.parent.rightChild = null;
                    element.parent.availableToAddRightChildren = true;
                }
                return true;
            }
        }
        return false;
    }

    private void goingToHaveChildren() {
        for (Entry<String> element : treeElements){
            if (element.parent.leftChild == null && element.parent.rightChild == null){
                element.parent.availableToAddLeftChildren = true;
                element.parent.availableToAddRightChildren = true;
            }
        }
    }

    public String getParent(String s) {
        for (Entry<String> element : treeElements) {
            if (element.elementName.equals(s)) return element.parent.toString();
        }
        return null;
    }

    public void printTree() {
        for (Entry<String> element : treeElements) {
            System.out.print(element.elementName + "\t");
        }
        System.out.println();
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }

}
