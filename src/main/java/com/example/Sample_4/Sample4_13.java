package com.example.Sample_4;

import java.util.function.IntFunction;

public class Sample4_13 {
    public static void main(String[] args) {
        IntFunction<String[]> obj1 = String[]::new;
        System.out.println(obj1.apply(5).length);
    }
}
