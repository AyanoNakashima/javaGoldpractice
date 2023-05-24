package com.example.Sample_4;

import java.util.function.Function;

public class Sample4_4 {


    public static void main(String[] args) {
        new Sample4_4().method();
        

    }

    int a = 10;

    private void method() {
        final int b = 20;
        int c = 30; // 暗黙的final
        int d=40;

        d = 50;
        int e=60;// 暗黙的final
        Function<String,String> f1 = (String str) -> {
            System.out.println("a : "+ a );
            System.out.println("b : "+ b );
            System.out.println("c : "+ c );
            // System.out.println("d : "+ d );
            // コンパイルエラー
            // Local variable d defined in an enclosing scope must be final or effectively final

            // e=60;
            // Local variable d defined in an enclosing scope must be final or effectively final

            return "Hello" + str;

        };

        System.out.println(f1.apply("naoki"));
    }
    
}
