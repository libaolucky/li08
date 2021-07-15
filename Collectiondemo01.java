package com.hp.jihe;

import java.util.ArrayList;
import java.util.Collection;

/*
* 集合：非常重要  
* */
public class Collectiondemo01 {
    public static void main(String[] args) {
        Collection c1=new ArrayList();
       // ArrayList c1=new ArrayList();
        //add增加
        c1.add("唐僧---执着的目标");
        c1.add("吉吉国王---过硬的技术");
        c1.add("猪八戒---老色笔，体贴关怀");
        c1.add("臭咸鱼---稳住");
        c1.add("白龙马---出门的面子");
        System.out.println("c1 = " + c1);
        
        //尺寸
        int size=c1.size();
        System.out.println("size = " + size);
        //判断是否为空
        boolean empty=c1.isEmpty();
        System.out.println("empty = " + empty);
        //清空
       // c1.clear();
        //再次判断是否为空
        boolean empty2=c1.isEmpty();
        System.out.println("empty2 = " + empty2);
        System.out.println("c1= " + c1);
        //集合的遍历  3中
        //1.迭代器
      /*  for (int i=0;i<c1.size();i++) {
            System.out.println("c1= " + c1.get(i));
        }*/
        //思考题：为什么Collection不能使用for循环？？？
        //因为set集合没有索引下标，所有for循环不能使用到Collection中

        //2.for循环
        for (Object o : c1) {
            System.out.println("o = " + o);
        }
        //迭代器 和for循环的区别
        //迭代器工作：有游标，问下一个，有没有下一个元素，如果有，就拿出来，没有就结束
        //for循环的工作：把集合从0-n 排序，从0开始，拿下标，
        //解释了：为什么学了for循环，再学一个迭代器

    }
}
