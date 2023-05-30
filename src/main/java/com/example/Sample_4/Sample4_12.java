package com.example.Sample_4;

import java.util.function.Function;

public class Sample4_12 {
    public static void main(String[] args) {
        Function<Integer,String[]> obj4_12 = String[]::new;
        System.out.println(obj4_12.apply(5).length);
    }
}
