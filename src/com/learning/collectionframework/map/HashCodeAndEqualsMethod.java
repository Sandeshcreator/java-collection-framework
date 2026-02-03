package com.learning.collectionframework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Alice", 1);

        map.put(p1, "Engineer"); // hashCode1 -> index1
        map.put(p2, "Designer"); // hashCode2 -> index2
        map.put(p3, "Manager");  // hashCode3 -> index3


        System.out.println(map.size());
        System.out.println(map.get(p1));
        System.out.println(map.get(p3));


        Map<String, Integer> map1 = new HashMap<>();

        map1.put("Shubham", 90); // hashCode1 -> index1
        map1.put("Neha", 92);    // hashCode2 -> index2
        map1.put("Shubham", 99); // hashCode1 -> same index1 -> equals() -> value replaced

    }
}

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Person other = (Person) obj;
        return this.id == other.getId() && Objects.equals(name, other.getName());

    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name;
    }
}