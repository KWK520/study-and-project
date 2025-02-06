package com.tj703.study;
//추상화!
//class 를 구체화 시키기 전에 추상적으로 정의하는 것
//구체화된 대상 : 수정이 힘들고 설계단계에서 구체화시키는 것이 무리가 있다.
//abstract class : 추상함수를 정의할 수 있는 클래스로 추상화의 중간단계에 있으면 추상메서드를 구현할 때 까지
// 객체가 될 수 없다.
abstract class Stu{
    String grade;
    String name;
    public void info(){
        System.out.println(this.grade);
    }
    abstract public void add();
    //{} 바디가 없는 함수 : 추상 함수
}
class MiddleStudent extends Stu{
    @Override
    public void add() {

    }
}
//interface : 완전히 추상화된 타입
interface ImpTest{
    //public void add(){}
    abstract public void add();
    void add(int a,int b);
}
interface ImpTest2{
    void add(int a, int b);
    void Mult();
    void Mult(int a,int b);
}
//interface 구현되어 있지 않기 때문에 우선 순위가 상과 없이 적용
interface ImpTest3 extends ImpTest2,ImpTest{

}

abstract class Test2 implements ImpTest3{
    @Override
    public void add() {}
    @Override
    public void Mult() {}
    @Override
    public void Mult(int a, int b) {}
}
//extends A,B : 자바는 다중 상속을 지원하지 않는다 (부모 자식 간의 override 로 우선 순위를 정하기 때문)
class Test3 extends Test2{
    @Override
    public void add(int a, int b) {  }
}



public class L08Abstract {
    //익명 클래스 L08Abstract$1
    //class 1 extends Stu{
    //    @Override
    //    public void add() {
    //
    //    }
    //}

    public static void main(String[] args) {
        //Stu stu=new Stu();
        Stu stu=new MiddleStudent();

        stu=new Stu(){
            @Override
            public void add() {

            }
        };
    }
}
