package com.example;

public class ExamPro {
    public static void main(String[] args) {
        //단항 연산자 + -
        int x = 100;
//        System.out.println(x);
//        x= - x;
//        System.out.println(x);
//
//        //증감 연산자
//        x++; //x = x + 1; x++;
//        System.out.println(x);
//        x--; //x = x - 1;
//        System.out.println(x);
//
//        int y = 1;
//        int z = 1;
//        int c = 1;
//
//        int result1 = ++y + 10;
//        System.out.println(result1);
//        int result2 = (z++ + 10);
//        System.out.println(result2);
//        int result3 = c++ +  10;
//        System.out.println(result3);

//        byte b4 = 125;
//        for (int i = 0; i<5; i++){
//        b4++;
//            System.out.printf("%d번째 루프 : %d",i, b4);
//        }

        x = 5;
        double d = 0.0;
        double z1 = x/d;   //x%d
        if (Double.isFinite(z1) || Double.isNaN(z1)){   // ||->or
            System.out.println("값 산출 불가");
        }else {
            System.out.println(z1);
        }



    }
}
