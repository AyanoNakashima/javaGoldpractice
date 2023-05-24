package com.example.Sample_4;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Sample4_1 {
    
    public static void main(String[] args) {
        
        List<String> words = Arrays.asList("Tanaka","Sato");
        // 匿名クラスで記述

        words.replaceAll(new UnaryOperator<String>() {
            public String apply(String str){
                return str.toUpperCase();
            }});


        // ラムちゃん
        words.replaceAll((String str) -> {return str.toUpperCase();});
        System.out.println(words);
        
        }
    }

