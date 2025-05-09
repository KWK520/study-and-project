package com.tj703.study;
class OutType{
    //InType in=new InType();
    InType in=this.new InType();
    //this == new OutType() : this 는 객체 자신

    class InType{
        //OutType 내부에서만 사용되는 자료의 타입을 정의
        int a=0;
        int b; //기본형은 null or undefined 를 정의할 수 없다.
        // 때문에 undefined 상태로 기본형 필드를 정의하면 자동으로 0이 된다.
        double d;//0.0
        float f;//false
        char c;// :문자표의 null
        //기본형에서 없다 라는 데이터 == 0
    }
}
public class L10ConstructorMethod {
    //main에서 User 객체를 생성하세요. User 는 필드로 age,name 가 있고 둘다 생성자로 초기화해야 합니다.
    User user=new User(39,"하니");
    class User{
        int age;
        String name;
        public User(int age,String name){
            this.age=age;
            this.name=name;
        }
        public int add(int [] nums){
            int add=0;
            //for(let num of nums){} : Iterator 반복문 (면접!)
//            for(int num : nums){
//                add+=(num); //대입연산자!
//            }
            //for(let i=0; i<nums.length; i++){let nun=nums[i];}

            for(int i=0; i<nums.length; i++){
                int num=nums[i];
                add+=num;
            }
            return add;
        }
    }
    public static void main(String[] args) {
        L10ConstructorMethod l10=new L10ConstructorMethod();
        System.out.println(l10.user.age);
        System.out.println(l10.user.name);
        int [] nums={10,20,30,40,50};
        int add=l10.user.add(nums);
        System.out.println("{10,20,30,40,50} 각 아이템의 합 : "+add);



        User user=l10.new User(41,"둘리");
        //해당 클래스 내부에 User가 하나뿐이기 때문에 L10ConstructorMethod 생략
        L10ConstructorMethod.User user2=l10.new User(21,"김기원");//권장
        System.out.println(user.age);
        System.out.println(user.name);
        //inner class
        OutType out=new OutType();
        System.out.println(out.in.a);
        System.out.println(out.in.d);
        System.out.println(out.in.f);
        System.out.println(out.in.c);

        //보통 innerClass 를 다른 곳에서 잘 정의하지 않지만 굳이 한다면...
        //OutClassName.InClassName (type)
        //new OutClassName().new InClassName() (객체)
        OutType.InType in=new OutType().new InType();//(이렇게는 거의 사용되지 않는다.)
        out=new OutType();

        OutType.InType outIn=out.new InType(); //조금 사용될 가능성이 있다.




    }
}