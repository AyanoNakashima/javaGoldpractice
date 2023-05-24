package com.example.Sample_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Sample4_6 {
    
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(3,1,2);
        // 匿名クラス
        Consumer<List<Integer>> con1 =new Consumer<List<Integer>>() {
            public void accept(List<Integer> list){
                Collections.sort(list);
                
            }
        };

        // ラムダ
        Consumer<List<Integer>> con2 = lamdaList -> Collections.sort(lamdaList);

        // staticメソッド参照
        Consumer<List<Integer>> con3 = Collections::sort;

        con3.accept(list);
        System.out.println(list);


    }
}
