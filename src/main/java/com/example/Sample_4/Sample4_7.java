package com.example.Sample_4;

import java.util.Comparator;

public class Sample4_7 {
    public static void main(String[] args) {

        // staticメソッド参照は引数が複数でも、引数の記述の省略が可能

        Comparator<Integer> comp = Integer::compare;
        System.out.println(comp.compare(1, 2));
        System.out.println(comp.compare(2, 1));

        
        
    }
}
