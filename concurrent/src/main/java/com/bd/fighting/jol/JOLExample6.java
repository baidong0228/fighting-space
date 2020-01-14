package com.bd.fighting.jol;/*
 * Copyright (c) 2016-2026 Founder Bdong. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Founder. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the agreements
 * you entered into with Founder.
 *
 */

import java.util.concurrent.CountDownLatch;

/**
 * This class of JOLExample is used for ...
 * 偏向锁和轻量级锁的相率问题
 *
 * 偏向锁效率远高于轻量级锁
 *
 * @author Bdong
 * @version 1.0 2020-01-13 20:28
 */
public class JOLExample6 {

    public static CountDownLatch countDownLatch = new CountDownLatch(1000000000);

    public static void main(String[] args) throws InterruptedException {
        System.out.println(String.format("start"));
        final C c = new C();
        long start = System.currentTimeMillis();

        for (int i=0;i<2;i++){
            new Thread(){
                @Override
                public void run() {
                    while (countDownLatch.getCount()>0){
                        c.substract();
                    }
                }
            }.start();
        }
        countDownLatch.await();


        long end = System.currentTimeMillis();
        System.out.println(String.format("%sms",end-start));
    }

}
