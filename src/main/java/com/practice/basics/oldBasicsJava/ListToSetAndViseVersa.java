package com.practice.basics.oldBasicsJava;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListToSetAndViseVersa {
    public static void main(String[] args) {
        List<Object> addNames = new ArrayList<>();
        addNames.add("Amit");
        addNames.add(1);
        addNames.add("Ram");
        addNames.add(2);
        addNames.add("Ram");
        addNames.add(3);
        addNames.add("Bhanu");
        addNames.add(4);

        System.out.println("Original List : \n" + addNames);

        Set<Object> uniqueName = new LinkedHashSet<>(addNames);
        System.out.println("Adding unique names to SET: \n" + uniqueName);

        List<Object> uniqueNameList = new ArrayList<>(uniqueName);
        System.out.println("Unique Name List : \n" + uniqueNameList);
    }
}
