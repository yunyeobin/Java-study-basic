package com.example;

public class 구구단 {
    //  제로베이스 양성준
//  콘솔 화면에 구구단 출력하기
// for (시작문 ; 종료문 ; 실행문)

        public static void main(String[] args) {
//            System.out.println("[구구단 출력]");
//            for (int i = 1; i < 10; i++) {
//                System.out.print("");
//                for (int j = 1; j < 10; j++) {
//                    System.out.print(String.format("%02d x %02d = %02d",j,i,j*i)); //구구단 세로로 출력시 i와j 위치 번경
//                    System.out.print("   ");
//                }
//                System.out.println();
//            }
            for (int i = 1; i <10; i++){
                System.out.print(i+"단  ");
                System.out.println();
                for (int j = 1; j < 10; j++) {
                    System.out.printf("%d x %d = %d  ", i,j,i*j);
                }
                System.out.println();
            }
        }
    }

