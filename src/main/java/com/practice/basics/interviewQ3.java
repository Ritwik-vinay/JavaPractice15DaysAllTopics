package com.practice.basics;

public class interviewQ3 {
    public static void main(String[] args) {
        String text = "Quote Reference Number: OABT/2026/000793Q";
        String [] test = text.split(" ");
        String textCode = test[3];

        System.out.println(textCode);
    }

}
