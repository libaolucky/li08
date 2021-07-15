package com.hp.jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* 斗地主  模拟  洗牌
* 牌数 ：54张  大王  小王  1-k，四个桃
*    ❤ ， ♠，♦ ♣，
*    1-10
*     ❤7  ♦7
 * */
public class DouDizhuTest {
    public static void main(String[] args) {
        //1.先造出四个花色
        List<String> colors=new ArrayList<>();
        colors.add("❤");
        colors.add("♠");
        colors.add("♦");
        colors.add("♣");
        //2.造出  10个 2-10
        List<String> numbers=new ArrayList<>();
        for (int i=2;i<=10;i++){
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        
        //3.上面的  colors和 number进行一个整合
        //放入到一个新的集合中  如何做到嵌套循坏
        List<String> piker=new ArrayList<>();
        //Set<String> piker=new HashSet<>();
        for (String color:colors){
            for (String number : numbers) {
                piker.add(color+number);
            }
        }
        piker.add("BigKing");
        piker.add("littleKing");
       // System.out.println("piker = " + piker);
        System.out.println(piker.size());

        //如果set也无法分开排序，改为list有一个方法可以打乱它的排序，只能打断list
        Collections.shuffle(piker);   //打断list的排序
        System.out.println("piker = " + piker);
        //给player1,palery2 player3 发牌。。
        List<String> player1=new ArrayList<>();  //玩家1
        List<String> player2=new ArrayList<>(); //玩家2
        List<String> player3=new ArrayList<>(); //玩家3
        List<String> Dipai=new ArrayList<>();

        for (int i = 0; i <piker.size() ; i++) {
            String pName=piker.get(i);  //每张扑克牌
            if (i>=51) {
                //注意:  底牌里面不能包含红桃3 .
                if (pName != "❤3") {
                    Dipai.add(pName);  //埋最后三张的底牌
                }
            }else{
                //给玩家1,2,3 发前面的 51张牌
                if (i % 3==0) {
                    player1.add(pName);
                    if (pName.contains("❤3")) {
                        System.out.println("玩家1是地主");
                    }
                }else if(i % 3==1){
                    player2.add(pName);
                    if (pName.contains("❤3")) {
                        System.out.println("玩家2是地主");
                    }
                }else{
                    player3.add(pName);
                    if (pName.contains("❤3")) {
                        System.out.println("玩家3是地主");
                    }
              }
            }
        }
        System.out.println("三张底牌是= " + Dipai);
        System.out.println("玩家1= " + player1);
        System.out.println("玩家2= " + player2);
        System.out.println("玩家3= " + player3);



        Collections.sort(piker);  //list的快速排序（不是人工指定的排序，下节课讲 人工指定排序）
        //System.out.println("piker = " + piker);

        //作业三：规定个地主：  1.规定谁摸到 红桃3  谁是地主，注意：底牌里不能包含红桃3

    }
}
