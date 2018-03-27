package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

/**
 * Description:饿汉模式:单例的实例在类装载时进行创建
 * Create by SunChenLong
 * 2018/3/27,11:02
 */
@Slf4j
@ThreadSafe
public class SingletonExample2 {

    /*私有构造函数*/
    private SingletonExample2(){}

    /*单例对象*/
    private static SingletonExample2 instance = new SingletonExample2();

    /*静态的工厂方法*/
    public static SingletonExample2 getInstance(){
        return instance;
    }
}
