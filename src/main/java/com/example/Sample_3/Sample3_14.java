package com.example.Sample_3;

public class Sample3_14 {
    public static void main(String[] args) {


        Gen g = new Gen();
        Integer i = g.method(1);
        System.out.println(i);

        
        String s1 = g.method("ABC");
        String s2=g.<String>method("abc");
        System.out.println(s1+ " "+ s2);


    }
    
    
}

class Gen{

    private String var1= "aaa";

    public <T> T method(T value){
        return value;
    }

    public String getVar1(){
        return var1;
    }

}
