package com.mmall.concurrency.example.publish;

import com.mmall.concurrency.annoations.NotRecommend;
import com.mmall.concurrency.annoations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

/**
 * Description:
 * Create by SunChenLong
 * 2018/3/27,10:52
 */
@Slf4j
@NotThreadSafe
@NotRecommend
public class Escape {

    private int thisCannBeEscape = 0;

    public Escape(){
        new InnerClass();
    }

    private class InnerClass{
        public InnerClass() {
            log.info("{}",Escape.this.thisCannBeEscape);
        }
    }

    public static void main(String[] args){
        new Escape();
    }
}
