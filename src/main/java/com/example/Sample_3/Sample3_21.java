package com.example.Sample_3;

import java.util.Arrays;
import java.util.List;

public class Sample3_21 {
    public static void main(String[] args) {
        String[] ary = {"A","B","C"};
        List<String> list = Arrays.asList(ary);
        
        // list.add("D");
        // .UnsupportedOperationException
        // asListによって作成されたリストは固定サイズのリストなので要素を追加すると例外が発生する


        list.set(2,"D");

        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
