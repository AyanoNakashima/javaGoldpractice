package com.example.Sample_3;

class Gen13<T>{
    private T var1;
    // private static T var2;
    public Gen13(T var1){
        this.var1 =var1;
    }

    public T getVar1(){
        return var1;
    }

    public void setVar1(T ver1){
        this.var1 = var1;

    } 

}

public class Sample3_13 {
    public static void main(String[] args) {
        
        Gen13<String> g1 = new Gen13<>("ABC");
        System.out.println(g1.getVar1());
        g1.setVar1("DEP");
        System.out.println(" "+g1.getVar1());


        Gen13<Integer> g2 = new Gen13<>(1);
        System.out.println(g2.getVar1());
        g2.setVar1(2);
        System.out.print(" "+g2.getVar1());


    }
    
}

