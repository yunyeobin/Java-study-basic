package com.example;

class Book{
    //출판사 : company
    //도서명 : bookTitle
    //가격 : price
    String company;
    String bookTitle;
    int price;


}

class Member{
    String name;
    String memberNo;
}





public class JavaTest01 {
     public static void main(String[] args) {

        //byte, short, int, long, float, double, boolean, char
        // 1. 정수형 데이터 타입(int) 변수, a,b,c 를 선언하시오
        // 2. 정수형 변수 a, 에 20, b에 30을 할당한 후 변수c에 a와 b의 곱한 값을 할당 하세요
        // 3. 모니터에 변수 a b c의 값을 출력하세요( 출력양식 :  a=20, b=30, c=600)


        int a, b, c;
        a = 20;
        b = 30;
        c = a*b;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);

        // 4. 실수형 데이터타입 float 변수 f를 선언하세요
        // 5. 변수 f에 34.5 값을 할당하세요
        // 6. 변수 f의 값을 출력하세요
        // 7. 문자 데이터 타입 d 변수를 선언하고 문자 'A'를 할당하고 출력하세요
        // 8. boolean 데이터타입 변수 e를 선언하고 true 값을 할당 후 출력하세요

        float f;
        f = 34.5f;
        System.out.println("f="+f);
        char d;
        d='A';
        System.out.println("d="+d);

        boolean e;
        e=true;
        System.out.println("e="+e);

        Book book;
        book = new Book();

        Member m1 = new Member();
        m1.name = "윤여빈";
        m1.memberNo = "1234";
        System.out.println("name=" + m1.name);
        System.out.println("memberNo=" + m1.memberNo);

        Member m2 = new Member();
        m2.name = "디디디";
        m2.memberNo = "12343";
        System.out.println("name=" + m2.name);
        System.out.println("memberNo=" + m2.memberNo);

        Member m3 = new Member();
        m3.name = "이이이";
        m3.memberNo = "112234";
        System.out.println("name=" + m3.name);
        System.out.println("memberNo=" + m3.memberNo);

        int sum = 0;
        sum = sum + 1;
        System.out.println(sum);
        sum = sum + 2;
        System.out.println(sum);
        sum += sum;
        System.out.println(sum);


        int x, y;
        x=10;
        y=20;
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println(x);
        System.out.println(y);
        System.out.println(x+" "+y);

        System.out.println('A'+'B');

    }
}
