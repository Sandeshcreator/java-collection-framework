package com.learning.collectionframework.map;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
//        SortedMap<String, Integer> map = new TreeMap<>((a, b) -> b.compareTo(a));
//        map.put("Sandesh", 52);
//        map.put("Hello", 52);
//        map.put("Kumar", 52);
//        System.out.println(map);

        SortedMap<Integer, String> map = new TreeMap<>();

        map.put(91, "Vivek");
        map.put(99, "Shubham");
        map.put(102, "Shubham");
        map.put(78, "Mohit");
        map.put(77, "Vipul");

        map.get(77);
        map.containsKey(78);
        map.containsValue("Vipul");

//        System.out.println(map.firstKey());
//        System.out.println(map.lastKey());
        // Returns all entries BEFORE key 91 in sorted order (91 excluded)
//        System.out.println(map.headMap(91));
// Returns all entries FROM key 91 onward in sorted order (91 included)
//        System.out.println(map.tailMap(91));

        NavigableMap<Integer, String> navigableMap = new TreeMap<>();

        navigableMap.put(1, "Vivek");
        navigableMap.put(2, "Shubham");
        navigableMap.put(5, "Shubham");
        navigableMap.put(8, "Mohit");
        navigableMap.put(11, "Vipul");

        System.out.println(navigableMap);
        System.out.println(navigableMap.ceilingEntry(5));
        System.out.println(navigableMap.lowerKey(5));
        System.out.println(navigableMap.ceilingKey(5));
        System.out.println(navigableMap.descendingMap());

    }
}
