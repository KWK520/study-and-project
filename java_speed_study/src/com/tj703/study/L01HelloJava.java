package com.tj703.study;

public class L01HelloJava {
    //함수 : 동작을 정의함
    //public : 접근지정자 (public :누구나다 접근가능,private:클래스내부에서만)
    //void : 반환값 (void: 반환값이 없다.)
    //add : 함수의 이름
    //() : 매개변수(파라미터) 함수가 실행에 필요한 인자들
    //{} : 함수의 영역
    //static : 인터프리터가 코드를 분석하면서 메소드를 메소드영역에 저장할때
    // static 이라 정의된 코드는 객체로 만들어서 바로 저장
    // 이때 이름 앞에 클래스명이 붙어서 클래스 변수 or 클래스 메소드라 부른다.
    public static int a=10;
    public static void add(){
        System.out.println(1+1);
    }

    //콜백함수 : 정의해놓은 함수를 다른 코드에서 호출
    //main 을 정의하고 실행하면 jvm 이 정의한 main 을 호출 후 실행
    //jvm 은 main 함수에 정의된 코드만 실행한다.

    public static void main(String [] args){
        System.out.println("안녕 자바!");
        L01HelloJava.add();
        //main 이 실행되기 전에 이미 static 으로 정의된 변수나 메소드는 객체가 되어 있음
        System.out.println(a); //클래스 내부에서는 클래스명 생략가능
        System.out.println(L01HelloJava.a);
    }
}
