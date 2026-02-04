package com.learning.collectionframework.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private final int capacity;

    public LRUCache(int capacity) {
        // initialCapacity, loadFactor, accessOrder=true (IMPORTANT for LRU)
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> studentMap = new LRUCache<>(3);

        studentMap.put("Bob", 99);
        studentMap.put("Alice", 89);
        studentMap.put("Ram", 91);

        // Access Bob to make it most recently used
        studentMap.get("Bob");

        // This will evict the least recently used entry (Alice)
        studentMap.put("John", 95);

        System.out.println(studentMap);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}
