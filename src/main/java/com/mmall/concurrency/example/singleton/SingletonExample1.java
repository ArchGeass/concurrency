package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.NotThreadSafe;

/**
 * Description:懒汉模式:单例的实例在第一次使用时进行创建
 * Create by SunChenLong
 * 2018/3/27,11:02
 */
@NotThreadSafe
public class SingletonExample1 {

    /*私有构造函数*/
    private SingletonExample1(){}

    /*单例对象*/
    private static SingletonExample1 instance = null;

    /*静态的工厂方法*/
    public static SingletonExample1 getInstance(){
        if(instance == null){
            instance = new SingletonExample1();
        }
        return instance;
    }
}
