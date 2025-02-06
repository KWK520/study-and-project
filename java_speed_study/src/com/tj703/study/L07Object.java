package com.tj703.study;
import java.lang.Object;
import java.util.Objects;

public class L07Object{
    public static void main(String[] args) {
        L07Object l07=new L07Object();
        Object o=l07;
        HongikStudent hongik=new HongikStudent("c001",11,"A+","승엽","일본어");
        Student stu=hongik;
        Object stuObj=stu;
        //new HongikStudent() > new Student() > new Object()
        //Object : 보든 타입의 부모고 객체 생성을 돕는다.
        //Object.equals(Object obj) : 나 자신과 다른 객체를 비교연산 하는 메소드
        //Object.toString() : 나 자신에 대한 설명
        //equals,toString 은 필드가 바뀔때마다 내용이 달라지기 때문에 재정의 필요
        System.out.println(stu.toString());
        //com.tj703.study.HongikStudent @ f3 eb a8 61 주소체계가 4byte
        //0 1 2진수
        //0 1 2 3 4 5 6 7 8 9  10진수
        //0 1 2 3 4 5 6 7 8 9 A B C D E F 16진수 == 2**4  == 4bit


        //비교연산 ==: 두개가 같은지 묻는 것 boolean(true 1,false 0)
        System.out.println(11==11);
        System.out.println("안녕"=="안녕");
        String s="안녕";
        System.out.println(s==s);
        //문자열은 자료형이지만 리터럴하게(new String() x) 선언하면
        //값(char[]{'안','녕'})이 같은것이 존재하면  새로 만들지 않고 그것을 참조(메모리 절약)
        System.out.println(new String("안녕"));
        System.out.println("안녕" == new String("안녕"));
        // ==  : 기본형의 값이 같은지만 비교연산 (자료형은 완전히 같은 것만 가능)
        int [] nums=new int[3];
        int []nums2={1,2,3}; //리터럴 선언법만 제공

        System.out.println("안녕".equals(new String("안녕")));
        EqualsTest e1=new EqualsTest("안녕",1,13.14f);
        EqualsTest e2=new EqualsTest("안녕",1,13.14f);
        System.out.println(e1==e2);
        //객체간의 동일하다는 의미는 필드가 같다
        System.out.println(e1.equals(e2));
    }
    //모든 타입의 부모인 조상 클래스 : Object
}

class EqualsTest{
    String a;
    int b;
    float c;
    public EqualsTest(String a, int b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof EqualsTest that)) return false;
        return b == that.b && Float.compare(c, that.c) == 0 && Objects.equals(a, that.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return "EqualsTest{" +
                "a='" + a + '\'' +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
