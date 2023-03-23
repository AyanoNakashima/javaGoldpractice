package com.example.Sample_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample3_12 {

// 型推論の話

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(10, "A");

        List<String> list1 = new ArrayList<>();
        list1.add("B");

        methodA(new ArrayList<String>());
        methodA(new ArrayList<>());// 型推論

        List<String> list2 = methodB();
        System.out.println(list2.hashCode());
        
        
    }

    static void methodA(List<String> list){
        System.out.println("methodA()");
    }

    // static ArrayList<> methodB(){}
    // メソッドの戻り値には型推論は使用できない！（当たり前）

    static ArrayList<String> methodB(){
        System.out.println("methodB()");
        return new ArrayList<>();

    }
}
