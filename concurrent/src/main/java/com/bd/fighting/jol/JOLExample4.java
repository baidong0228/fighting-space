package com.bd.fighting.jol;/*
 * Copyright (c) 2016-2026 Founder Bdong. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Founder. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the agreements
 * you entered into with Founder.
 *
 */
import org.openjdk.jol.info.ClassLayout;

/**
 * This class of JOLExample is used for ...
 * 重量级锁
 *
 * @author Bdong
 * @version 1.0 2020-01-13 20:28
 */
public class JOLExample4 {
    static A a = new A();

    public static void printThreadName(){
        synchronized (a){
            System.out.println("Thread ==> " +Thread.currentThread().getName());
            System.out.println(ClassLayout.parseInstance(a).toPrintable());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread("t1"){
            @Override
            public void run() {
                printThreadName();
            }
        };

        Thread t2 = new Thread("t2"){
            @Override
            public void run() {
                printThreadName();
            }
        };

        t1.start();
        t2.start();
    }

}
