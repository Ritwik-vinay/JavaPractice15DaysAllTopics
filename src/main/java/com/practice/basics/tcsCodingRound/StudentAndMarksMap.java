package com.practice.basics.tcsCodingRound;

import org.apache.commons.collections4.map.LinkedMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudentAndMarksMap {
    public static void main(String[] args) {
        TreeMap< Integer, String> studentDetails= new TreeMap<>();
        //LinkedHashmap to maintain the order Insertion
        studentDetails.put(1, "Ritwik Vinay");
        studentDetails.put(6,"Aman");
        studentDetails.put(2,"Anand");
        studentDetails.put(3,"Abhinav");
        studentDetails.put(4,"Abhishek");
        studentDetails.put(5,"Bhanu" );

        System.out.println(studentDetails);
    }
}
