package com.sample5;

import java.util.Optional;

public class Sample5_8 {
    public static void main(String[] args) {
        Optional<Integer> op1 = Optional.of(10);
        Optional<Integer> op2 = Optional.empty();
        System.out.println("op1.get() : " + op1.get());

        // System.out.println("op2.get() : " + op2.get());
        // NoSuchElementException: No value present

        System.out.println("opt1.isPresent() : " + op1.isPresent());
        System.out.println("opt2.isPresent() : " + op2.isPresent());
    
    }
}
