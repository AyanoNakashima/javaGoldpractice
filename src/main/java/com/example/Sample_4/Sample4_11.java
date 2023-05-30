package com.example.Sample_4;

import java.util.function.Supplier;

public class Sample4_11 {


    public static void main(String[] args) {
        // Supplier<Foo> obj = () -> new Foo();
        Supplier<Foo2> obj4_11 = Foo2::new;
        System.out.println(obj4_11.get().a);

    }

    class Foo2{

        int a = 0;
        Foo2(){
        }
        Foo2(int a){
            this.a=a;
        }

    }


    
}
