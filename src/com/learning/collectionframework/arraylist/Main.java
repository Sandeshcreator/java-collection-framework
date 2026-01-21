package com.learning.collectionframework.arraylist;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();


        List<String> list1 = Arrays.asList("Monday", "Tuesday");

        String[] array = {"Apple", "Banana", "Cherry"};

        List<String> list2 = Arrays.asList(array);


        List<Integer> integers = List.of(1, 2, 3, 4);

        /*
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(Integer.valueOf(1));
        list.remove(1);

        System.out.println(list.get(1));
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        for (int x : list) {
            System.out.println(x);
        }

        System.out.println(list.contains(5));
        System.out.println(list.contains(2));

        list.remove(2);

        list.add(0, 50);
        list.set(2, 50);

        System.out.println(list);

*/


    }
}
