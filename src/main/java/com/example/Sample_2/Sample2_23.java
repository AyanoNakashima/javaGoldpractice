package com.example.Sample_2;

public class Sample2_23 {


    public  static void main(String[] args){
      new Outer().method();
        
    }  

    
}

interface MyInter{
    void methodA();
}

class Outer{
    void method(){

        new MyInter() {
            public void methodA(){
                System.out.println("methodA()");
            }
        }.methodA();
    

    }

}

