package com.msb.basic.class05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        // collection
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(true);
        System.out.println(collection.size());

        ((ArrayList)collection).add(0, "msb");
        System.out.println(collection);
        Object[] objects = collection.toArray();

        // list
        List list = new ArrayList();
        list.add("a");
        list.add(1);
        list.add(true);
        System.out.println(list);
        System.out.println(list.get(0));
    }
}
