package com.example.Sample_3;

import java.util.HashSet;

class Foo{
    private String str;
    public Foo(String str){
        this.str = str;
    }
    public String toString(){
        return str+" ";
    }
}

public class Sample3_3 {
    public static void main(String[] args) {

        // オブジェクトが同一かそうでないかはequalsメソッドを用いる
        // オーバーライドされていない場合はオブジェクトクラスのメソッドになる
        // つまり　＝＝　同じ参照であるかがポイント
        // f1とf4は同じ参照でないため（newしてるので）、同一性はfalseになり、それぞれHashSetに格納される

        HashSet<Foo> set = new HashSet<>();
        Foo f1 = new Foo("BBB"); set.add(f1);
        Foo f2 = new Foo("AAA"); set.add(f2);
        Foo f3 = new Foo("CCC"); set.add(f3);
        Foo f4 = new Foo("AAA"); set.add(f4);

        System.out.println("size:"+set.size());

        for(Foo f : set){
            System.out.println(f);

        }
     }
}



