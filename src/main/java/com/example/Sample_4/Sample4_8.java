package com.example.Sample_4;

import java.util.Arrays;
import java.util.List;

public class Sample4_8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,1,2);
        // for(int a:list){
        //     System.out.println(a);
        // }

        // list.forEach(a -> System.out.println(a));


        list.forEach(System.out::println);
    }
    
}
