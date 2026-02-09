package com.learning.collectionframework.garbagecollection;

import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) {
        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("iphone", "16pro"));

        System.out.println(phoneWeakReference.get());
        System.gc();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }

        System.out.println(phoneWeakReference.get());


    }
}

class Phone {
    private String name;
    private String model;

    public Phone(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
               "name='" + name + '\'' +
               ", model='" + model + '\'' +
               '}';
    }
}

