package com.learning.collectionframework.arraylist;

import java.util.ArrayList;
import java.util.List;

class Student implements Comparable<Student> {
    private String name;

    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student student) {
        return Double.compare(student.getGpa(), this.getGpa());
    }

    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", gpa=" + gpa +
               '}';
    }
}

/*
class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
  */

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 3.8));
        students.add(new Student("Bob", 3.5));
        students.add(new Student("Charlie", 3.9));

//        students.sort((o1, o2) -> {
//            if (o2.getGpa() - o1.getGpa() > 0) {
//                return 1;
//            } else if (o2.getGpa() - o1.getGpa() < 0) {
//                return -1;
//            } else {
//                return o1.getName().compareTo(o2.getName());
//            }
//
//        });

        students.sort((o1, o2) -> Double.compare(o2.getGpa(), o1.getGpa()));

//        students.sort((o1, o2) -> {
//            int gpaCompare = Double.compare(o2.getGpa(), o1.getGpa()); // DESC
//
//            if (gpaCompare != 0) {
//                return gpaCompare;
//            }
//
//            return o1.getName().compareTo(o2.getName()); // ASC
//        });


        for (Student s : students) {
            System.out.println(s.getName() + ": " + s.getGpa());
        }


        /*
        List<String> list = new ArrayList<>();

        List<String> list1 = Arrays.asList("Monday", "Tuesday");

        String[] array = {"Apple", "Banana", "Cherry"};

        List<String> list2 = Arrays.asList(array);

        List<Integer> integers = List.of(1, 2, 3, 4);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.sort(new MyComparator());
        System.out.println(list);

        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort((a, b) -> b.length() - a.length());
        System.out.println(words);
         */

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
