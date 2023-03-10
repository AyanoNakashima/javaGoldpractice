package com.example.Sample_2;


class Outer {

    private int val1 = 100;
    private static int val2 = 200;
    
        class A {
         // class Aは　非staticクラス　インナークラス
    
           void method1(){
            System.out.println("instance val1 ="+ val1);
         }
         // static void method2(){ 
                // System.out.println("static val2 ="+ val2);
            // }     // コンパイルエラー：非staticクラスはstaticメンバを持てない
    
    
        }
    
        static class B {
             //staticクラス
    
            // void method1(){
               // System.out.println("instance val1 ="+ val1);
            //  } コンパイルエラー：staticクラスはOuterで作ったインスタンス変数にはアクセスできない
    
            static void method2(){
               System.out.println("static val2 ="+ val2);
            }
        }
    
    }
    
    class Sample2_19{
        public static void main(String[] args) {
            Outer.A a = new Outer().new A();
            //非staticクラスのインスタンス化
    
            Outer.B b = new Outer.B();
            //staticクラスのインスタンス化
    
            a.method1();
            // b.method2();
    
            Outer.B.method2();
    
    
        }
    }
        
    