package com.tj703.study;

//class com.tj703.study.A{ }
//java 문서가 class 문서로 컴파일될 때 java 문서에 정의된 class 단위로 컴파일하는데
//동일한 패키지(폴더)에 같은 class 가 존재할 수 없기 때문

//class 를 고유한 이름 (보통 도메인)의 패키지 하위에 두면
//class 명이 절대 중복되지 않는다. => 때문에 패키지를 명시
import java.util.Date; //main 에서 사용하는 class 를 미리 가져오는 방법
//public class 가 아닌 것은  import 가 불가능
//class == 객체의 타입
class B{
    public int a=100;
    //같은 이름인데 매개변수가 다르게 정의가능 : 오버로드 overloading
    //다형성 : 하나가 역할이 여러개 있는 것 (객체지향 문법)
    //객체지향 문법  : 코드 작성을 객체 기준으로 하는 문법 (high level 언어 특징)
    public B(){} //default 생성자 : 정의하지 않아도 자동완성
    public B(int a){
        //int a : 매개변수 B()가 실행될 때 필요한 인자
        //보통 생성자의 매개변수는 필드를 초기화하는 목적으로 사용됨
        //a=a; //함수의 내의 변수명과 필드명이 같을 때 변수가 우선 순위를 갖는다.
        this.a=a;
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }
    //개발자는 이름 짓기를 굉장히 싫어합니다.!!
    public void add(int a, int b,int c){
        System.out.println(a+b+c);
    }

}

public class L03Object2 {
    public static void main(String[] args) {
        System.out.println(new com.tj703.study.B().a);
        System.out.println(new B().a);
        //다름 라이브러리 사용법
        //java.util : 자바개발에 도움을 주는 class 의 집합
        //Date() :현재 시간을 출력 (1970 01 01 부터 생성한 밀리초 UNIX time)
        System.out.println(new java.util.Date());
        System.out.println(new java.util.Date().getTime());//1737947926398
        System.out.println(new Date().toLocaleString());//지역기준 시간 출력
        //2025. 1. 27. 오후 12:21:15
        System.out.println(new B().a);
        System.out.println(new B(-1000).a);
        //new 생성자를 호출할 때마다 객체를 새롭게 만든다.-> 인스턴스
        new B().add(10,20);
        new B().add(20,30,40);

        //변수 : 객체를 재사용하는 목적으로 정의하는 것
        B b=new B();
        //B : class 명을  type 이라 부른다.
        //b : 변수의 이름
        //new B(); : 변수가 참조할 객체
        // = :대입연산
        //1. 인스턴스가 생성됨
        //2. 변수가 생성됨
        //3. 인스턴스를 변수가 참조
        b.add(1000,-2000);
        b.add(1,2,3);
        //. 필드의 하위를 접근
    }
}
