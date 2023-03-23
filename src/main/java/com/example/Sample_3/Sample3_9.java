package com.example.Sample_3;

import java.util.HashMap;

public class Sample3_9 {
    public static void main(String[] args) {
        
        HashMap<Integer,String> map = new HashMap<>();
        map.put(0,"AAA");
        map.put(1,"BBB");
        map.put(2,"AAA"); // 値の重複(何の問題もない)
        map.put(1,"CCC"); // キーの重複　上書きされる

        System.out.println(map.containsKey(2)); // 引数と同じキーがあればtrue
        System.out.println(map.containsValue("XXX"));  // 引数と同じ値があればtrue

        for(int i = 0; i< map.size(); i++){
            System.out.print(map.get(i)+" ");
        }
    
    
    }
}
