package com.example.Sample_3;

import java.util.ArrayDeque;
import java.util.Queue;

public class Sample3_7 {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();
        queue.offer("1");
        queue.offer("2");

        System.out.println("queue.size() : "+ queue.size());

        for(; 0 < queue.size();){
            queue.poll();
            System.out.println(" queue.poll()");
        }

        System.out.println("queue.size() : "+ queue.size());

        System.out.println("ueue.peek() :"+ queue.peek());
        // System.out.println(queue.element()); 　キューが空だとNoSuchElementException
        
    }
    
}
