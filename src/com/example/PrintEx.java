package com.example;

public class PrintEx {
    public static void main(String[] args) {
        System.out.printf("이름 : %s %s %s \n", "신세계", "INC", "입사");
        // 정수 %d 실수%f 문자열%s

        //출력결과 : 나이는 25 살입니다. printf()사용하여 출력하세요
        System.out.printf("나이는 %d 살입니다 \n",25);

        //출력결과 : 이름은 신세계 나이는 25살 입니다.
        System.out.printf("이름은 %1$s 나이는 %2$d 살 입니다", "신세계", 25);
        System.out.println();


        //123
        System.out.printf("%1$d\n", 123);
        //___123
        System.out.printf("%6d\n", 123);
        //123___
        System.out.printf("%-6d\n", 123); //-는 뒤를 비워랏..!
        ///000123
        System.out.printf("%06d\n", 123); //0은 남는자리 0으로 채우겠다.

        System.out.println("======정수표현=======");

        //____123.45
        System.out.printf("%-10.2f\n", 123.45); //10자리 수의 소수 둘째자리까지 표시하겠다.

        //abc
        System.out.printf("%s\n", "abc");
        //___abc
        System.out.printf("%6s\n", "abc");
        //abc___
        System.out.printf("%-6s\n", "abc");


        
    }
}
