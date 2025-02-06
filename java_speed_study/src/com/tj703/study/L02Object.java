package com.tj703.study;

class A{
    public int a=10;
    //a를 객체로 만들려면 a를 포함하는 클래스 A를 개체롤 만들면 된다.
    public static int b=20;
    //생성자: 클래스가 객체가될 때 필드를 초기화하는 용도 (필드의 기본값을 만든다.)
    public A(){

    }
    public void add(){
        //this == com.tj703.study.A 객체가 되었을 때 생성되는 (필드 접근자)

        System.out.println(this.a+a);
    }
}
public class L02Object {
    public static void main(String[] args) {
        // System.out.println(com.tj703.study.A.a);
        System.out.println(A.b); //method 영역에 만들어지는 객체
        //new com.tj703.study.A();
        System.out.println(new A().a); //heap 영역에 만들어지는 객체
        //a 를 A각 객체가 되었을 때 소속되어 만들어져서 필드라 부른다
        //필드 : 객체가 되었을 때
        //속성 : 객체가 되기 전에 A에 정의해놓은 상태
        new A().add();
        //**응용프로그램이란
        //OS를 이용해서 메모리에 특정 데이터를 저장(ram)하고 연산(cpu)시키며
        //OS가 제공하는 라이브러(awt,swing)를 사용한다.
        // 또한 HDD,SSD 저장된 파일을 불러(input)거나 쓰기(output)도한다.
        // 네트워크가 연결되어 있다면 통신(input, output)을 구현할 수도 있다.
        // => 응용프로그램의 동작은 모두 객체를 저장하고 연산하면서 발생

        //자바에서 객체를 생성하는 방법
        //1. static 을 클래스의 필드나 메소드에 정의 : 메소드영역 (클래스 변수)
        //2. new 연산자로 클래스의 생성자를 호출  : heap 영역 (인스턴스)

        //클래스 변수 장점 : 어디서든 접근 가능 , 만들어 놓으면 계속 유지
        //단점1  : 객체를 생성하면 계속 유지되기 때문에 메모리에 부담 => 너무 많이 하면 안됨
        //단점2  : 어디서든 접근 가능하기 때문에 수정된 내역을 파악하기 힘들다  => final, 싱글톤패턴

        //인스턴스의 장점 : 메모리를 걱정할 필요가 없다. 코드가 간단해 진다.

    }
}
