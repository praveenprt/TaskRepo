package Task15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Duplicate {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(6);

        HashSet<Integer> duplicates = findDuplicates(list);
        System.out.println("Duplicate elements: " + duplicates);

        removeDuplicates(list);
        System.out.println("List after removing duplicates: " + list);
    }

    public static HashSet<Integer> findDuplicates(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            Integer item = list.get(i);
            if (!set.add(item)) {
                duplicates.add(item);
            }
        }

        return duplicates;
    }

    public static void removeDuplicates(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<>(list);
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        list.clear();
        for (Integer item : set) {
            list.add(item);
        }
    }}