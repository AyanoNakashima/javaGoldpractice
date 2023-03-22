package com.example.Sample_3;

import java.util.ArrayDeque;
import java.util.Queue;

public class Sample3_6 {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");

        System.out.println(queue);
        System.out.println("peek() : "+ queue.peek()); // 検査　キューの先頭を取得するが削除しない
        System.out.println(queue);
        System.out.println("remove() : "+queue.remove()); // 削除　キューの先頭を取得して削除する
        System.out.println(queue);






    }
}
