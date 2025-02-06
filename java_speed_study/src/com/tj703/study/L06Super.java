package com.tj703.study;

//Student 유사하게  => 상속
//1.이름 짓기
//2.같은 일 또하는 것

class HongikStudent extends Student{
    //HongikStudent extends Student
    //HongikStudent 가 Student 를 포함
    //new HongikStudent()==this 내부에서 new Student()==super 가 포함됨
    String major;
    String grade;
    public  HongikStudent(){super();}
    public HongikStudent(String id,int classNum,String grade,String name){
        //super();
        super(id,classNum,grade,name);
    }
    public HongikStudent(String id,int classNum,String grade,String name,String major){
        //super();
        //this.major=major;
        //부모 객체의 필드는 내것 처럼 사용하기 위해 부모를 먼저 작성후
        //나 자신의 필드를 재정의
        //this.grade=grade;
        super(id,classNum,grade,name);
        this.major=major;
        this.grade=grade;
        //extends 상속에서는 항상 자식이 부모를 이긴다.
    }
    //어노테이션 : 컴파일할 때 검사, 자동 완성
    @Override
    public void info(){
        System.out.print("("+this.classNum+") 전공이 "+this.major+"인 ");
        super.info(); //함수의 호출은 위치 상관없다.
    }

    @Override
    public String toString() {
        //toString  : 나는 이런 객체야! 필드를 설명
        return "HongikStudent{" +
                "major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", id='" + id + '\'' +
                ", classNum=" + classNum +
                ", name='" + name + '\'' +
                '}';
    }
}


public class L06Super {
    public static void main(String[] args) {
        HongikStudent stu=new HongikStudent("a001",10,"C+","고길동");
        stu.major="컴퓨터공학";
        stu.info();

        //객체지향 문법 상속
        //상속에서 상속 받은 타입을 자식 상속한 타입을 부모라 한다.
        //자식 타입이 객체가 되면 내부에서 부모타입이 같이 객체로 생성됩니다.
        //자식은 내부에 정의된 부모객체를 super 로 참조합니다.

        //자식 생성자를 재정의할때 꼭 부모생성자를 맨위에 작성해야합니다.
        //부모와 자식의 필드의 이름이 같은 때 자식의 필드가 우선 순위가 높다.
        //이때 자식이 부모 필드를 override(메소드) 했다고 한다.

    }
}
