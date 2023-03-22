package com.example.Sample_3;

import java.util.Iterator;
import java.util.TreeSet;

public class Sample3_5 {
    public static void main(String[] args) {

        // Iteratorのサンプル

        TreeSet<String> set = new TreeSet<>();
        set.add("C"); 
        set.add("A");
        set.add("B");

        // この時点で内部ソート済


        Iterator<String> iter = set.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next()+" ");
        }
        
        // boolean has next() 次の要素があればtrue
        // E next() 次の要素を返す
        // void remove() next()の呼び出しごとに一度だけ呼び出し可能で、イテレータによって最後に返された値を削除する




    }
}
