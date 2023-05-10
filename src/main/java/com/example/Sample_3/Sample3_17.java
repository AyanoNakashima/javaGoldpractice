package com.example.Sample_3;

import java.util.ArrayList;
import java.util.List;

public class Sample3_17 {
    public static void main(String[] args) {
        List<X> l1 =new ArrayList<>();
        l1.add(new X());

        List<Y> l2 =new ArrayList<>();
        l2.add(new Y());


        //method1()の呼び出し
        method1(l1);
        method1(l2);


        //method2()の呼び出し
        method2(l1);
        method2(l2);

    
    }

    public static void method1(List<? extends X> list){
        // Xクラス、またはそのサブクラスであるYクラスを格納したリストが渡ってくる
        
        // list.add(new X());
        // list.add(new Y()); 
        // 実行時まで引数の型がわからないので、listにaddしようとするとコンパイルエラーになる

        System.out.println(list.get(0)+ " ");

    }

    public static void method2(List<? super Y> list){
        // Yクラス、またはそのスーパークラスであるXクラスを格納したリストが渡ってくる

        // list.add(new X()); 
        list.add(new Y()); 
        // タイプと同じYなら格納可能（確定しているので）




        System.out.println(list.get(0)+ " ");

    }
    
}

class X{
    public String toString(){
        return "X";
    }
}

class Y extends X{
    public String toString(){
        return "Y";
    }
}

