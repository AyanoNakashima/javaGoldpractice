package com.example.Sample_4;

import java.util.function.BiFunction;

public class Sample4_10 {
    public static void main(String[] args) {

        BiFunction<String,Integer,Character> obj = (s,i) -> s.charAt(i);
        System.out.println(obj.apply("Java", 2));

        BiFunction<Integer,String,Character> obj2 = (i,s) -> s.charAt(i);
        System.out.println(obj2.apply(2,"Java"));

        BiFunction<String,Integer,Character> obj3 = String::charAt;
        System.out.println(obj3.apply("Java", 2));

        // コンパイルエラー
        // BiFunction<Integer,String,Character> obj4 = String::charAt;
        // System.out.println(obj3.apply("Java", 2));



        
    }
    
}
