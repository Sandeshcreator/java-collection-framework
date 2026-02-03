package com.learning.collectionframework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Sandesh");
        map.put(2, "Sadikshya");
        map.put(3, "Sabina");

        System.out.println(map);
        System.out.println(map.get(28));

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Saendesh"));


        System.out.println(map.keySet());

        for (int i : map.keySet()) {
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println(entry.getKey() + " : " + entry.getValue());
            System.out.println(entry.getValue());

        }

    }
}
