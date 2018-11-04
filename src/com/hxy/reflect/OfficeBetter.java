package com.hxy.reflect;

/**
 * Created by xyh on 2018/10/25.
 */
public class OfficeBetter {

    public static void main(String[] args){
        try{
            //动态加载类，在运行时刻加载
            Class c = Class.forName("");

        }catch (Exception e){
          e.printStackTrace();
        }
    }
}

interface OfficeAble{

    void start();
}

class Word implements OfficeAble{
    @Override
    public void start() {
         System.out.println("word ...starts...");
    }
}