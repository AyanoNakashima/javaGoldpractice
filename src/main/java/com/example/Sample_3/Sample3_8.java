package com.example.Sample_3;

import java.util.ArrayDeque;
import java.util.Deque;

public class Sample3_8 {
    public static void main(String[] args) {

        // Dequeueは後入れ先だしなので、最後に追加したものが最初に取得される

        Deque<String> deq = new ArrayDeque<>();
        deq.push("1");
        deq.push("2");
        deq.push("3");

        System.out.println(deq);

        System.out.println("pop() : " + deq.pop()); // キューの先頭を取得、削除

        System.out.println(deq);

    }
}
