package com.example.Sample_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
    private String name;
    private Integer id;
    public Employee(String name,Integer id){
        this.name=name;
        this.id=id;
    }
    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}

class Myrule implements Comparator<Employee>{
    public int compare(Employee obj1,Employee obj2){
        return obj1.getId().compareTo(obj2.getId());
    }
}



public class Sample3_19 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Taro", 20);
        Employee e2 = new Employee("Tomoko", 10);
        Employee e3 = new Employee("hitomi", 50);

        ArrayList<Employee> ary = new ArrayList<>();
        ary.add(e1);
        ary.add(e2);
        ary.add(e3);

        System.out.println("<ArrayListのインデックス順>");
        print(ary);

        System.out.println("<Myruleで定義したインデックス順>");
        Collections.sort(ary,new Myrule());
        print(ary);



    }


    public static void print(ArrayList<Employee> ary){
        for( Employee obj : ary){
            System.out.println(obj.getId()+" "+obj.getName());

        }
    }

    
}
