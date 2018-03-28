package com.mmall.concurrency.example.threadLocal;

/**
 * Description:
 * Create by SunChenLong
 * 2018/3/28,11:19
 */
public class RequestHolder {

    private final static ThreadLocal<Long> requestHolder = new ThreadLocal<>();

    public static void add(Long id){
        requestHolder.set(id);
    }

    public static Long getId(){
        return requestHolder.get();
    }

    public static void remove(){
        requestHolder.remove();
    }
}
