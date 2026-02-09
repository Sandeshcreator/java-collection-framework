package com.learning.collectionframework.garbagecollection;

import java.util.WeakHashMap;


public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        loadCache(imageCache);
        System.out.println(imageCache);
        System.gc();
        simulateApplicationRunning();

        System.out.println("running after cleared " + imageCache);
    }

    private static void loadCache(WeakHashMap<String, Image> imageCache) {
        String k1 = new String("img1");
        String k2 = new String("img1");

        imageCache.put(k1, new Image("Image 1"));
        imageCache.put(k2, new Image("Image 2"));

    }


    private static void simulateApplicationRunning() {
        try {
            System.out.println("Something is cooking");
            Thread.sleep(2000);
        } catch (Exception e) {

        }

    }
}

class Image {
    private String image;

    public Image(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return image;
    }
}

