package com.practice.basics.tcsCodingRound;

public class main {
    public static void main(String[] args) {
        String[] str = {"tuesday", "thursday", "Sunday", "Monday"};

        // Correct order of days
        String[] order = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length - 1 - i; j++) {

                int index1 = getDayIndex(str[j], order);
                int index2 = getDayIndex(str[j + 1], order);

                if (index1 > index2) {
                    // swap
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }

        for (String s : str) {
            System.out.println(capitalize(s));
        }
    }

    // helper to get index ignoring case
    public static int getDayIndex(String day, String[] order) {
        for (int i = 0; i < order.length; i++) {
            if (day.equalsIgnoreCase(order[i])) {
                return i;
            }
        }
        return -1;
    }

    // optional: format output like "Sunday"
    public static String capitalize(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
