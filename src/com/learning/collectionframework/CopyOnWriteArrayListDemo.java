package com.learning.collectionframework;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("A");
        list.add("B");

        for (String s : list) {
            System.out.println(s);
            list.add("D");
        }

        System.out.println(list);
    }
}
