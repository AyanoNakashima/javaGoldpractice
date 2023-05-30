package com.sample5;

import java.util.stream.Stream;

public class Sample5_4 {
    public static void main(String[] args) {
        long result1 = Stream.of("a","b","c").count();
        System.out.println(result1);
        Stream<String> stream1 = Stream.of("a","b","c");
        stream1.forEach(System.out::print);

        // for(String s : stream1){
        //     System.out.println(s);
        // }

        // Can only iterate over an array or an instance of java.lang.Iterable
        // StreamはIterableを継承していないのでfor文は使えずコンパイルエラーになる

    }
}
