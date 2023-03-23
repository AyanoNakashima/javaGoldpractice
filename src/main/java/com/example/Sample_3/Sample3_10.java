package com.example.Sample_3;

import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.TreeSet;


public class Sample3_10 {
    public static void main(String[] args) {

        //TreeMapはNavigableMapを実装しているので、指定されたキーに最も近いキーと値を返すことができる

        NavigableMap<String,String> map = new TreeMap<>();
        map.put("1111","ItemA");
        map.put("2222","ItemB");
        map.put("3333","ItemC");
        map.put("4444","ItemD");

        String key = "2000";

        if(map.containsKey(key)){
            System.out.println("get() : " + map.get(key));
            // キーがある場合は値を表示
        }else{
            System.out.println("heigherKey() : " + map.higherKey(key)); 
            System.out.println("lowerKey() : " + map.lowerKey(key));
        }

        NavigableMap<String,String> sub = map.subMap("2000", true, "3500", true);
        // subMapでキー範囲を指定して要素を取り出すこともできる

        System.out.println("2000-3500 : " + sub);


        System.out.println(" ");



        TreeSet<String> set = new TreeSet<>();
        set.add("1111");
        set.add("2222");
        set.add("3333");

        System.out.println(set);

        System.out.println("ceiling('2000') : " + set.ceiling("2000"));
        System.out.println("floor('2000') : " + set.floor("2000"));

        
    }



    
}
