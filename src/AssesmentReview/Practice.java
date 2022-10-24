package com.codeup.java.AssesmentReview;

public class Practice {
    public static void main(String[] args) {
        System.out.println(subtractTen(22));


    }
    public static int subtractTen(int number){
        return number - 10;
    }

    public static double average(double array[]){
       double total = 0;
        for (int i = 0; i < array.length; i++){
            total = total +array[i];
        }
        return total/array.length;
    }
}
