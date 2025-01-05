package com.techtutor.collection;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;

public class ListApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("karuppu");
        names.add("samy");
        names.add("sunil");
        names.add("john");

        // 1. for loop itertion
        for (int i = 0; i < names.size(); i++) {
        System.out.print("\tname::" + names.get(i));
        }

        // 2. enhanced for loop

        for (String s : names) {
        System.out.print("\t name:: " + s);
        }

        // 3. iterate using iterator interface
        System.out.println("\n Iterating using iterator interface");
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
        System.out.print("\t name:: " + itr.next());
        }

        // 4. iterate using list iterator interface
        System.out.println("\n Iterating using list iterator interface");
        ListIterator<String> listItr = names.listIterator();
        while (listItr.hasNext()) {
        System.out.print("\t name:: " + listItr.next());
        }
        System.out.println("\n before removing element::" + names);
        names.remove("sunil");
        System.out.println("\t after removing element::" + names);

    }
}
