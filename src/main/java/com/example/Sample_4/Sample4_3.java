package com.example.Sample_4;

import java.util.function.Function;

public class Sample4_3 {
    public static void main(String[] args) {
        
    // 匿名くらす

    String str1 = new Function<String,String>(){
        public String apply(String str){
            return "hello" + str;
        }
    }.apply("naoki");
    System.out.println("匿名クラス : "+str1);

    // ラムダ省略なし

    Function<String,String> f2 = (String str) -> {
        return "hello" + str;
    };

    String str2 =f2.apply("naoki");
    System.out.println("ラムダ省略なし : "+str2);

    // ラムダ省略あり

    Function<String,String> f3 = str -> "hello" + str;
    
    String str3 =f3.apply("naoki");
    System.out.println("ラムダ省略あり : "+str3);

    }

    
}
