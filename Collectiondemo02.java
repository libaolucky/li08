package com.hp.jihe;

import java.util.ArrayList;

/*
 * 集合 存的是对象的什么？
 *      存的是对象的引用， 当对象通过 外力改变了，那么 集合中的内存也会变
 *      只存的是把手
 * */
public class Collectiondemo02 {
    public static void main(String[] args) {
        Person fansisi = new Person();
        fansisi.setName("范思思");
        fansisi.setHeigh(156);
        fansisi.setAge(16);
        ArrayList c = new ArrayList();
        c.add(fansisi);
        for (Object o : c) {
            System.out.println(o);
        }

        fansisi.setName("佳丽");
        fansisi.setHeigh(400);
        fansisi.setAge(39);
        for (Object o : c) {
            System.out.println(o);
        }

    }


}
