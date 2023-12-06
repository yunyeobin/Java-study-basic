package com.example;

import java.util.Scanner;

public class PrintfExtest {

    // final : class(상속금지), method(재정의 금지), cariable(상수) 앞에 붙을 수 있는 키워드


    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //1. Scanner 클래스를 이용하여 정수형 변수 a, b에 값을 입력받고
        // 두 변수의 결과값을 result 변수에 저장한 후 출력하는 코드작성
        // 입력 : "a의 값 입력 : "
        //       "b의 값 입력 : "
        // 출력 : "a+b =" 결과값
//        System.out.println("a의 값 입력 :");
//        int a = in.nextInt();
//        System.out.println("b의 값 입력 :");
//
//        int b = in.nextInt();
//        System.out.println("a+b="+(a+b));


        //2. 문자열을 한 줄씩 입력받아 계속 출력하는 프로그램, 만약에 "q"가 입력되었다면 입력받기 멈춤!
        //while 사용. 조건식을 계속 반복해서 돌릴때. 종료조건 제시해야됨.
//        String str = in.next();//걍 next 가 string 입력하는 애임. 정수는 nextInt 썼죠?
//        while (!str.equals("q")){ //!가 들어가면 부정.
//            System.out.println(str);
//            str = in.next();
//        }
        //while(조건식) {}
        
        //3.학생의 이름을 입력받고 해당 학생의 국어, 영어, 수학, 과학 4과목의 점수를 입력받아 총합과 평균을 구한 후
        //출력 : 000학생의 국어: 점수, 영어: 점수, 수학: 점수, 과학: 점수
//                000학생의 총점은 00, 평균은 00.0입니다.
//
//        System.out.println("이름을 입력 하세요");
//        String name = in.next();
//        System.out.println("국어 점수를 입력 하세요");
//        int kor = in.nextInt();
//        System.out.println("영어 점수를 입력 하세요");
//        int eng = in.nextInt();
//        System.out.println("수학 점수를 입력 하세요");
//        int math = in.nextInt();
//        System.out.println("과학 점수를 입력 하세요");
//        int sci = in.nextInt();
//        int total = (kor+eng+math+sci);
//        int avg = (total/4);
//        System.out.printf("%1$s학생의 국어: %2$d, 영어: %3$d, 수학: %4$d, 과학: %5$d\n", name,kor,eng,math,sci);
//        System.out.printf("%1$s학생의 총점은 %2$d, 평균은 %3$d 입니다", name,total,avg);


        int a = in.nextInt();

        int b = in.nextInt();

        int c = a++ * --b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

   }


}

