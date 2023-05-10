package com.example.Sample_3;

public class Sample3_15 {
    public static void main(String[] args) {
        new Foo().method("ABC");
        new Bar().method(10);
    }
}

interface MyIn<T>{
    void method(T t);
}

class Foo implements MyIn<String>{
    public void method(String s){
        System.out.println("new Foo().method('ABC') : "+ s);
    }

}

class Bar implements MyIn<Integer>{
    public void method(Integer s){
        System.out.println("new Bar().method(10) : "+ s);
    }

}
