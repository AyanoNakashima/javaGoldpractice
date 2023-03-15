package com.example.Sample_2;

import java.util.function.Function;

public class Sample2_25 {
    public static void main (String[] args){

        // 関数型インターフェースでの実装
        MyFunc obj = new MyFunc();
        String str = obj.apply("naoki");
        System.out.println(str);

        // 匿名クラスでの実装
    String str2= new Function<String,String>(){
    public String apply(String str2){
        return "hello! "+str2;
       }
    }.apply("naoki");

System.out.println(str2);
}



}

class MyFunc implements Function<String,String>{
    public String apply(String str){
        return "hello! "+str;
    }
}
