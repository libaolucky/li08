package com.hp.jihe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
*  JDK8 的快速 去集合中的属性
* */
public class ArrayListDemo {

    public static void main(String[] args) {
        Person diaochan=new Person();
        diaochan.setAge(12);
        diaochan.setHeigh(167);
        diaochan.setName("貂蝉");

        Person xaioqiao=new Person();
        diaochan.setAge(19);
        diaochan.setHeigh(177);
        diaochan.setName("小乔");

        Person sunshangxiang=new Person();
        diaochan.setAge(25);
        diaochan.setHeigh(187);
        diaochan.setName("孙尚香");
        
        //需求：有一个曹操，需要一个String集合，该集合中的值是提取与上面3000个list中的值  把美女的名字都存进去
        List<Person> list=new ArrayList<>();
        list.add(diaochan);
        list.add(xaioqiao);
        list.add(sunshangxiang);
        System.out.println("list = " + list);


        List<String> names = new ArrayList<>();
        //1.遍历 list集合，拿出对象的names 付给新的names集合中
    /*    for (Person s:list){
            String name=s.getName();
            names.add(name);  //2.赋值给新的集合
        }
        System.out.println("names = " + names);
        */
     //以上是传统的，新的呢？ JDK8 Stream()  作业：自我学习 JDK的新特性，如何新的遍历 至少2个demo
        List<String> namesLists=list.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("namesLists = " + namesLists);


    }
}
