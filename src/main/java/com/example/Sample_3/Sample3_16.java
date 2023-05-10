package com.example.Sample_3;

public class Sample3_16 {
    public static void main(String[] args) {
        // 利用する側のクラス
        // Integerを使うGenオブジェクトの作成
        Gen16<Integer> g1 = new Gen16<>(100);
        g1.display();

        Gen16<Double> g2 = new Gen16<>(3.14);
        g2.display();

    }
}

class Gen16<T extends Number>{
    private T var;
    public Gen16(T var){
        this.var = var;
    }
    public void display(){
        System.out.println(var);
    }
}

