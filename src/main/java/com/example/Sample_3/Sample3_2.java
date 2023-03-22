package com.example.Sample_3;

import java.util.HashSet;
import java.util.TreeSet;


public class Sample3_2 {
    public static void main(String[] args) {

        // Set インターフェースについて
        // 特徴　ArrayListと違い、重複を保持しない
        // 以下同期性サポートなし
        
        String[] ary = {"CCC","AAA","BBB"};

        // HashSetの特徴　
        // 高速だが順序付けられない

        HashSet<String> hashset = new HashSet<>();
        hashset.add(ary[0]);
        hashset.add(ary[1]);
        hashset.add(ary[2]);
        hashset.add(ary[0]);

        System.out.println("HashSet size"+hashset.size());
        for(String s:hashset){
            System.out.print(s+" ");
        }

        System.out.println();

        // TreeSetの特徴　内部でソートが行われる

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add(ary[0]);
        treeSet.add(ary[1]);
        treeSet.add(ary[2]);
        treeSet.add(ary[0]);

        System.out.println("TreeSet size"+treeSet.size());
        for(String s:treeSet){
            System.out.print(s+" ");
        }

    }

    
    
}
