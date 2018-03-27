package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.Recommend;
import com.mmall.concurrency.annoations.ThreadSafe;

/**
 * Description:枚举模式.最安全
 * Create by SunChenLong
 * 2018/3/27,11:02
 */
@ThreadSafe
@Recommend
public class SingletonExample7 {

    /*私有构造函数*/
    private SingletonExample7(){}

    /*单例对象*/
    private static SingletonExample7 getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton{
        INSTANCE;

        private SingletonExample7 singleton;

        /*JVM保证此方法绝对只调用一次*/
        Singleton() {
            singleton = new SingletonExample7();
        }

        public SingletonExample7 getInstance() {
            return singleton;
        }
    }
}
