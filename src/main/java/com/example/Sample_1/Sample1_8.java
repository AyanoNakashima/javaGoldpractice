package com.example.Sample_1;

public class Sample1_8 {
    public static void main(String[] args) {
        Card2 card = Card2.SPADE;
        System.out.println("card : "+ card);
        System.out.println("card.getA() : "+ card.getA());
        System.out.println("card.name() : "+ card.name());
        System.out.println("card.toString() : "+ card.toString());

        System.out.println("card.ordinal() : "+card.ordinal());
        // ordinal() 位置を返す
        System.out.println(Card2.valueOf("SPADE"));

        for(Card2 obj : Card2.values()){
            System.out.println("for : "+obj+" ");
        }


        Card2 card2 = Card2.DIAMONDS;
        System.out.println(card2);
        System.out.println(card2.getA());
        System.out.println(card2.ordinal());
        
    }
    
}

enum Card2{
 SPADE(3),CLUB(1),DIAMONDS(4),HEARTS(2);  //  コンストラクタの引数を書かないとコンパイルエラーになる
 private int a;

//  Enumのコンストラクタは暗黙的private publicなど指定するとコンパイルエラーになる
Card2(int a){
    this.a= a;
}

public int getA(){
    return a;
}

}
