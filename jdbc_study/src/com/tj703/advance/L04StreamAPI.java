package com.tj703.advance;

import java.util.*;

public class L04StreamAPI {
    public static void main(String[] args) {
        //반복문 검색 방법
        //1. 직접 참조 : for(int i=0; i<arr.length; i++) {arr[i]}
        //2. Iterator 이용 : for(int n : arr){}
        //3. Stream Api : Arrays.stream(arr).forEach((n)->{})
        //3. Stream Api : list.stream().forEach((n)->{})
        //직접 참조, Iterator 반복문은 외부 반복문 : 반복문이 직접 들어남
        //String API 를 내부 반복문 : 재정의한 callback 함수를 반복 호출
        //js: 내부반복문을 List 타입에 이미 다 구현해 놓음.
        //java: 내부반복문이 없다가 Stream API로 구현

        List list=new ArrayList();
        list.add("안녕");
        list.add(null);
        list.add('a');
        list.add(39);
        list.add(true);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+",");
        }
        System.out.println();
        for(Object o:list){
            System.out.print(o+",");
        }
        System.out.println("\n List가 js따라서 만든 내부 반복문 ");
        list.forEach((o)->{
            System.out.print(o+",");
        });
        System.out.println("\n List만 내부 반복문을 가지고 있어서 " +
                "모든 자료를 내부 반복문으로 사용할 수 있도록 돕는 자료형 Stream");
        list.stream().forEach((o)->{
            System.out.print(o+",");
        });
        //Collection 으로 구현한 자료형(List,Set,Map), Array
        //List,Array : 순서와 길이가 있는 잘료
        //Set : 중복을 허용하지 않는 자료로 순서가 없다.
        //Map(==JS Object): key(Set) 와 value 로 된 자료
        Set set=new HashSet();
        set.add(11);
        set.add(22);
        set.add(33);
        set.add(44);
        set.add(11);
        set.add(11);
        set.add(22);
        //List{11,22,33,44,11,11,22}
        //Set(11,22,33,44) -> [33, 22, 11, 44]
        System.out.println("\n"+set+", size : "+set.size());
        //Map : Set을 key로 사용
        Map<String,Object> map=new HashMap();
        map.put("id","tj703");
        map.put("name","경민");
        map.put("age",39);
        map.put("married",true);
        map.put("age",40);
        System.out.println("\n"+map);
        //{name=경민, id=tj703, married=true, age=39, age=40}
        //{name=경민, id=tj703, married=true, age=40}
        //key 인 age 가 중복될 수 없기 때문에 기존의 age 를 바꾼다.

        set.stream().forEach((o)->{
            System.out.print(o+",");
        });
        //steam 자료는 list 와 유사하기 때문에 Map은 steam으로 바꿀 수 없다.
        //Map의 데이터를 Entry 바꿔서 가져와서 반복문 사용
        Set keys=map.entrySet();
        System.out.println("/n"+keys);
        //{'key': 'value','key': 'value'} =>{'key=value','key=value'}
        map.entrySet().stream().forEach((entry)->{
            System.out.println(entry.getKey()+","+entry.getValue());
        });
        map.forEach((k,v)->{
            System.out.println(k+","+v);
        });
    }
    //high level 언어 python js (os 에서 동작하는 응용프로그램 제작하는데 사람이 이해하기 쉽도록)
    //high middle level java (os 에서 동작하는 응용프로그램 제작+c,c++포함 시켜서 동작)
    //low level 언어 c++,c,Object c (하드웨어를 간접적으로 조작 os,응용프로그램 => cpu ram 동작원리 이해)
    //어셈블리 언어 (하드웨어를 직접 조작 공학 => cpu ram 조작)

    //native app : OS의 언어와 같은 응용프로그램(OS 에서 제공하는 package 만드는 앱)
    //=>window, ios, android 이 독립적으로 제작해서 동작이 빠르고 os의 모든 기능을 사용가능
    //=>개발 속도가 느리고 비용이 증가
    //플러터,react : OS에서 제공하는 것을 우회에서 응용프로그램 제작
    //os의 공통기능을 이용해서 만들며 하나를 만들면 다 같이 동작
    //=>개발 속도가 빠르고 비용이 감소하며 모든 os에서 동일한 디자인의 동작을 구현가능
    // (플러터나 react 에서 제공하는 기능만 제공)

    //google 플러터 : html canvas 같이 그래픽을 표현하는 컴포넌트에 모든 것을 그리는 형태로 구현
    //facebook 리엑트 : html+js 로 제작 => 웹 같은 느낌

    //플러터 : 안드로이드가 java 베이스의 os라 오라클이 java를 인수하면서 소송 전쟁 중
    //=> 새로운 os에 플러터를 native app 로 만들 예정

    //리엑트 : 오픈소스 프로젝트이면서 속도가 좀 느린편이라 리엑트를 사용하지 않고 바닌라 자바
    //스크립트로 구현한 web app 으로 돌아가는 추세
    //jOuery : 버림받음 (js 업데이트를 많이 해서)

    //리엑트를 배우는 이유?
    //1.국내 취업이 좋아서
    //2.js로 된 어려운 문법을 배우는 기회 => js 고급 개발자

    //플러터를 배우지 않는 이유
    //1.아직 불완전 -> 기본 앱을 구현하는 것은 쉽지만 native app 기능을 사용하려면 너무 어렵다.\
    //2.dart 언어를 배워야하는데 dart가 플러터 말고 사용하는 것이 없다.
}


