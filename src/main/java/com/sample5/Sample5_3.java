package com.sample5;

import java.util.Arrays;
import java.util.List;

public class Sample5_3 {
    public static void main(String[] args) {
        List<String> data1 = Arrays.asList("mana","naoki","ryo");
        boolean result1= data1.stream().allMatch(s -> s.length() >= 3);
        boolean result2 = data1.stream().anyMatch(s -> s.length() == 4);
        boolean result3 = data1.stream().noneMatch(s -> s.length() == 4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        // Stream<String> stream1 = data1.stream();
        // boolean result4 = stream1.allMatch(s -> s.length() >= 3 );
        // boolean result5 = stream1.allMatch(s -> s.length() >= 3 );

        // 実行時エラー
        // IllegalStateException: stream has already been operated upon or closed

        // 終端操作は２度呼べない
        
        

        
    }
}
