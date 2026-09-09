package com.practice.basics.rsPractice.NewUpdatedCourse;

public class adjacentIndexArrDifference {
    public static void main(String[] args) {
        int[] num={1,4,8,15,17};
        System.out.println(adjacentArrayDifference(num));
    }
    static int adjacentArrayDifference(int[] num){
        int maxdiff=0;

        for(int i=1;i<=num.length-1;i++){
            int diff=Math.abs(num[i]-num[i-1]);
            if(maxdiff<diff){
                maxdiff=diff;
            }
        }
        return maxdiff;
    }
    
}
