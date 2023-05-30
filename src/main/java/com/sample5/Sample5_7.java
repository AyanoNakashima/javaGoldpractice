package com.sample5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample5_7 {
    public static void main(String[] args) {
        int ary[] = IntStream.range(1,10).toArray();
        // 未満
        int[] ary2 = IntStream.rangeClosed(1, 10).toArray();
        // 以下
        Object[] ary3 = Stream.of("a","b").toArray();
        String[] ary4 = Stream.of("a","b").toArray(String[]::new);

        System.out.println("ary1 : "+ary.length);
        System.out.println("ary2 : "+ary2.length);
        System.out.println("ary3 : "+ary3.getClass());
        System.out.println("ary4 : "+ary4.getClass());


    }
}
