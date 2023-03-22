package com.example.Sample_2;

public class Sample2_20 {
    class A {
        void methodA(){
            System.out.println("methodA()");
        }
    }

    static class B{
        static void methodB(){
            System.out.println("methodB()");
        }
    }

    public  static void main(String[] args){
        new Sample2_20().new A().methodA();
        // new A.methodA(); と記述するとコンパイルエラー


        // new Sample2_20().B().methodB();
        new Sample2_20.B().methodB();

        Sample2_20.B.methodB();
        B.methodB();
    }
    
}
