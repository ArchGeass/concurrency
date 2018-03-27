package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.NotRecommend;
import com.mmall.concurrency.annoations.ThreadSafe;

/**
 * Description:懒汉模式:单例的实例在第一次使用时进行创建
 * Create by SunChenLong
 * 2018/3/27,11:02
 */
@ThreadSafe
@NotRecommend
public class SingletonExample3 {

    /*私有构造函数*/
    private SingletonExample3(){}

    /*单例对象*/
    private static SingletonExample3 instance = null;

    /*静态的工厂方法*/
    public static synchronized SingletonExample3 getInstance(){
        if(instance == null){
            instance = new SingletonExample3();
        }
        return instance;
    }
}
