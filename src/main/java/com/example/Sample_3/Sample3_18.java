package com.example.Sample_3;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Sample3_18 {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(300);
        hSet.add(20);
        hSet.add(500);
        System.out.println("HashSet : " + hSet);

        TreeSet<Integer> tSet = new TreeSet<>();
        tSet.add(300);
        tSet.add(20);
        tSet.add(500);
        System.out.println("TreeSet : " + tSet);

        TreeSet<String> tSet1 = new TreeSet<>();
        tSet1.add("mao");
        tSet1.add("Mao");
        tSet1.add("100");
        System.out.println("TreeSet : " + tSet1);

        TreeMap<String,Integer> tMap = new TreeMap<>();
        // tMap.add("",0); mapはput
        tMap.put("2",300);
        tMap.put("map",1);
        tMap.put("3",20);
        tMap.put("1",500);
        System.out.println("TreeMap : " + tMap);

        
    }
}
