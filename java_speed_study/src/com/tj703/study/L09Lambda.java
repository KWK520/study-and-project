package com.tj703.study;
@FunctionalInterface
interface Inter{
    void add(int a,int b);
    //void add();
}


public class L09Lambda {
    int a=10;
    class A{
        int a=L09Lambda.this.a * L09Lambda.this.a;
        public A(){
            System.out.println(L09Lambda.this.a);
            System.out.println(this.a);
        }
    }//내부클래스 : 포함하는 클래스가 개체로 생성되고 A가 객체가 될 수 있다.
    static class B{} //포함하는 클래스를 이름으로만 갖는다.
    //static class 1 implements Inter{
    //}
    public static final int i2=10;
    public static void main(String[] args) {
        L09Lambda.A a=new L09Lambda().new A();
        //L09Lambda$A
        L09Lambda.B b=new L09Lambda.B();
        int i=10;
        Inter inter=new Inter(){
            @Override
            public void add(int a, int b) {
                System.out.println(a+b+i);
            }
        };

        //inter=new L09Lambda().new 1()
        //inter=new L09Lambda.1()
        //람다식 : 추상메소드가 한개일 때 메서드만 구현한 것 처럼 작성
        //람다식으로 작성가능한 interface를 FunctionalInterface라 부른다.
        inter=(c,d)->{
            System.out.println(c+d+i);
        };
        //익명클래스가 길어서 짧게 구현하려고
        //함수형언어인 척 하려고
    }
}
