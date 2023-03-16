package com.example.Sample_3;

import java.util.ArrayList;

public class Sample3_1 {
    public static void main(String[] args) {
        
    ArrayList<Integer> list = new ArrayList<Integer>();
    Integer i1 = new Integer(1);
    int i2 = 2;
    Integer i3 = i1;

    list.add(i1);
    list.add(i2); // AutoBoxing
    list.add(i3); // 値の重複可能

    list.add(1,5);// インデックス１に５を追加　以降の要素は繰り下げ

    System.out.println("size : "+ list.size());

    for(int i =0 ; i < list.size();i++){
        System.out.println("list.get(i)"+list.get(i));
    }

    System.out.println();

    for(Integer i : list){
        System.out.println("System.out.println(i)"+i);
    }


}
}
