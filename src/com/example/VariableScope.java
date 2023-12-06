package com.example;

public class VariableScope {
    public static void main(String[] args) {
//        int v1 = 15;
//
//        if (v1>10){
//            int v2 = v1 - 10;
//            System.out.println(v2);
//        }
//        int ko = 90;
//        int eng = 100;
//        int math = 88;
//        int sum = ko + eng + math;
//
//        if (sum > 80) {
//            int total = sum;
//            double avg = sum/3.0;
//            System.out.println("총합 : " + total + " " + "평균 : " + avg);
//        }
        //System.out.println(total, avg, v2); scope이 달라 사용불가.

        byte b = 125;
        for (int i = 0; i<5; i=i+2){
            b++;
            System.out.println("i = " + i);
            System.out.println(b);
        }
        System.out.println(b);
    }
}
