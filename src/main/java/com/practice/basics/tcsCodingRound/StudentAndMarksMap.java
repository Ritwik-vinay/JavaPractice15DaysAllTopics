package com.practice.basics.tcsCodingRound;

import org.apache.commons.collections4.map.LinkedMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentAndMarksMap {
    public static void main(String[] args) {
        Map<String , Integer> studentDetails= new LinkedHashMap<>();
        studentDetails.put("Ritwik Vinay", 1);
        studentDetails.put("Aman", 6);
        studentDetails.put("Anand", 2);
        studentDetails.put("Abhinav",3);
        studentDetails.put("Abhishek",4);
        studentDetails.put("Bhanu", 5);

        System.out.println(studentDetails);
    }
}
