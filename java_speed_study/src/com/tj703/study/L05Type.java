package com.tj703.study;
class Student{
    //필드 (속성,생성자,메소드)
    String id;
    int classNum;
    String grade;
    String name;
    public Student(){}
    public Student(String id, int classNum, String grade, String name){
        this.id=id;
        this.classNum=classNum;
        this.grade=grade;
        this.name=name;
    }
    public void info(){
        System.out.println(this.name+"은 성적이 "+this.grade+" 입니다.");
    }
}
public class L05Type {
    public static void main(String[] args) {
        Student s=new Student();
        s.id="a0012";
        s.classNum=12;
        s.grade="B+";
        s.name="경민";
        System.out.println(s.name+"은 학번이 "+s.grade+" 입니다.");
        s.info();
        s.grade="A+";
        s.info();

        Student s2=new Student("b0031",10,"C+","둘리");
        s2.info();

    }
}
