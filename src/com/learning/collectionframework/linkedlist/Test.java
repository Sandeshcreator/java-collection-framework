package com.learning.collectionframework.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
//        Node node1 = new Node();
//        Node node2 = new Node();
//        node2.value = 2;
//        node2.next = null;
//        node1.value = 1;
//        node1.next = node2;

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.get(2);
        linkedList.addLast(4);
        linkedList.addFirst(5);
        linkedList.getLast();
        System.out.println(linkedList);
        linkedList.removeIf(x -> x % 2 != 0);
        System.out.println(linkedList);


        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));
        LinkedList<String> animalsToRmove = new LinkedList<>(Arrays.asList("Dog", "Lion"));
        animals.removeAll(animalsToRmove);
        System.out.println(animals);


    }
}

//class Node {
//    public int value;
//    public Node next;
//}
