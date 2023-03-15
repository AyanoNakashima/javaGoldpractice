package com.example.Sample_2;

public class Sample2_21 {

    public  static void main(String[] args){
        new Outer().new A().method(300);
    }  
}

class Outer{
    class A{
        public int num=200;
        void method(int num){
            System.out.println("num:"+num);
            System.out.println("this.num:"+this.num);
            System.out.println("Outer.this.num:"+Outer.this.num);
        }
    }
    private int num=100;
}
