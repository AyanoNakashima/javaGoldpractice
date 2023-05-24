package com.example.Sample_3;

import java.util.Arrays;

public class Sample3_20 {

    public static void main(String[] args) {
        int[] ary1 = {3,1,2};
        print(ary1);

        Arrays.sort(ary1);
        System.out.println();
        print(ary1);

        Object[] ary2={
            new String("aa"),new Integer(1)};

        // Arrays.sort(ary2);
        // Exception in thread "main" java.lang.ClassCastException
        // java.lang.String cannot be cast to java.lang.Integer
        
    }

    public static void print(int[] ary){
        for(int num : ary ){
            System.out.print(num + " ");
        }
    }
    
}
