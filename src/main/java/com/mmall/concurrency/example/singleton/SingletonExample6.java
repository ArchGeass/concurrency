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
public class SingletonExample6 {

    /*私有构造函数*/
    private SingletonExample6(){}

    /*单例对象*/
    private static SingletonExample6 instance = null;

    static {
        instance = new SingletonExample6();
    }

    /*静态的工厂方法*/
    public static SingletonExample6 getInstance(){
        return instance;
    }

    public static void main(String[] args){
        System.out.println(getInstance().hashCode());
        System.out.println(getInstance().hashCode());
    }
}
