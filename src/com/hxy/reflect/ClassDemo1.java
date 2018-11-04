package com.hxy.reflect;

/**
 * Created by xyh on 2018/10/25.
 */
public class ClassDemo1 {

    public static void main(String[] args) {
        // Foo的实例对象如何表示
        Foo foo = new Foo();  //foo 就表示出来了
        // Foo 这个类 也是一个实例对象，Class类的实例对象，如何表示呢
        // 任何一个类都是Class的实例对象，这个实例对象又有三种表示方式
        // 第一种表示方式----> 实际在告诉我们任何一个类都有一个隐含的静态成员变量class

        Class c1 = Foo.class;

        //第二中表达方式，已经知道该类的对象通过getClass方法

        Class c2 = foo.getClass();

        /**
         * 官网c1、c2表示了Foo类的类类型（clasa type）
         * 万事万物皆对象
         * 类也是对象，是Class类的实例对象
         * 这个对象我们称为该类的类类型
         */

        // 不管c1 or c2 都代表了Foo类的类类型，
        // 一个类只可能是Class类的一个实例对象
        System.out.println(c1 == c2);

        //第三种表达方式
        Class c3 = null;
        try {
            // 类的全称
            c3 = Class.forName("com.hxy.reflect.Foo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(c2 == c3);
        //我们完全可以通过类的类类型创建该类的对象实例---> 通过c1 or c2 or c3 创建Foo的实例对象
        try {
            Foo  foo1 = (Foo) c1.newInstance();
            foo1.print();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}


class Foo{
     void print(){
         System.out.println("输出的类型为：foo");
     }
}