package com.example.Sample_4;

import java.util.function.UnaryOperator;

public class Sample4_9 {
    public static void main(String[] args) {

        UnaryOperator<String> obj =s -> s.toUpperCase();
        // UnaryOperator<String> obj2 =s::toUpperCase;
        



        UnaryOperator<String> obj3 = String::toUpperCase;
        System.out.println(obj3.apply("naoki"));
        
    }
   
    
}
