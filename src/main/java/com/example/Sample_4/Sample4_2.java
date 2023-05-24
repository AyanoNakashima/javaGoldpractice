package com.example.Sample_4;

import java.util.Arrays;
import java.util.List;

public class Sample4_2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Tanaka","Aato");

        // ラムダをさらに省略
        words.replaceAll(str -> str.toUpperCase());
        System.out.println(words);
        
    }

    
}
