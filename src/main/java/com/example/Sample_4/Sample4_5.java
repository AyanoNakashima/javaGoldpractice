package com.example.Sample_4;

import java.util.function.Function;

public class Sample4_5 {


    public void method4_5(){

        Function<String,Integer> f1 = str -> Integer.parseInt(str);
        int num1= f1.apply("100");
        System.out.println(num1);


        // メソッド参照　クラス名/インターフェース名::メソッド名
        // 引数、かっこ省略可能

        Function<String,Integer> f2 = Integer::parseInt;
        int num2= f2.apply("200");
        System.out.println(num2);
    

    }


public static void main(String[] args) {

    new Sample4_5().method4_5();

    
}
}



