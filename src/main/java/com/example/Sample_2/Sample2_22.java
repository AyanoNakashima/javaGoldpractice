package com.example.Sample_2;

public class Sample2_22 {

    public  static void main(String[] args){
        Outer outer = new Outer();
        outer.methodOuter(3,4);
        
    }  

    
}



class Outer{
    private static int a =1;
    private int b =2;

    void methodOuter(final int c,int d){
        final int e =5;
        int f = 6;

        class A{
            void method(){
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
                System.out.println(e);
                System.out.println(f);
                // e=100;コンパイルエラー
                // f=100;コンパイルエラー

            }
        }
        new A().method();
    }
}